#Taxi Fee Calculation

##Question:

`我们考虑出租车计价问题，出租车的运价是每公里0.8元，八公里起会加收50%的每公里运价，起步价是两公里以内6块，停车等待时加收每分钟0.25元，最后计价的时候司机会四舍五入只收块块钱。`

##Analysis:

###Requirements:
1. The price stars with 6 and it will contains 2km.
2. From 2km to 8km the price should be 0.8/km.
3. From 8km the price should be 1.2/km.
4. Waiting time price is 0.25/min.
5. The total price will half adjust.

Based on this I think it's better to use the [Decorator Pattern](https://en.wikipedia.org/wiki/Decorator_pattern) to calculate the taxi fee. We can extract the input should be the **Order** object, based on [Interface Oriented Design](https://en.wikipedia.org/wiki/Interface-based_programming), the Order should be an interface... 

###Oh!!!
It seems we are still use the nomarl process to develop our program, we should use *TDD*, now let's start the first test.

```java
    @Test
    public void testCalculatePrice(){
        Order order = new Order();
        order = new Order();
        order.setDistance(12);
        order.setTime(5);
        TaxiFee taxiFee = new TaxiFee();
        taxiFee.calculate(order);
        assertTrue(order.getPrice()==17);
    }
```
Of cause, to make sure we can run this test, we must add some classes and functions.

#####Order.java
```java
    public class Order {
        private int distance;
        private int time;
        private float price;

        public int getDistance() {
            return distance;
        }

        public void setDistance(int distance) {
            this.distance = distance;
        }

        public int getTime() {
            return time;
        }

        public void setTime(int time) {
            this.time = time;
        }

        public float getPrice() {
            return price;
        }

        public void setPrice(float price) {
            this.price = price;
        }
    }
```
#####TaxiFee.java
```java
    public class TaxiFee {
        public void calculate(Order order) {
    }
}
```
Now, let's run this test!
![Test 1](https://raw.githubusercontent.com/sunjintw/homework/master/homework1/jinsun/screenshot/Screen%20Shot%202015-12-02%20at%208.28.30%20PM.png)

Oh, it failed. Don't worry, just leave it here, we can continiue doing the next thing. we can write the specific test for each detail requirement. For the first one is the start price caculator. By the way, we should refactor the test class to move the order object.

```java
    Order order;

    @Before
    public void before(){
        order = new Order();
        order.setDistance(12);
        order.setTime(5);
    }
    @Test
    public void testStartPrice() {
        PriceCal startPriceCal = new StartPriceCal();
        startPriceCal.calculate(order);
        assertEquals(6.0, order.getPrice());
    }
```
And then, write the start price calculator, of cause, write the price calculator interface first.

```java
    public interface PriceCal {
        void calculate(Order order);
    }

    public class StartPriceCal implements PriceCal {
        @Override
        public void calculate(Order order) {
            order.setPrice(order.getPrice() + 6);
        }
    }
```
Now, run the *testStartPrice* test case.
![Test 2](https://raw.githubusercontent.com/sunjintw/homework/master/homework1/jinsun/screenshot/Screen%20Shot%202015-12-02%20at%209.06.52%20PM.png)

Yeah~ this one is passed. So, we should doing this for each specific reuqirement as below:

```java
    @Test
    public void testMiddlePrice() {
        PriceCal middlePriceCal = new MiddlePriceCal();
        middlePriceCal.calculate(order);
        assertEquals(4.8, order.getPrice());
    }
    public class MiddlePriceCal implements PriceCal {
        @Override
        public void calculate(Order order) {
            double middlePrice = order.getDistance() <= 8 ? (order.getDistance() - 2) * 0.8 : 4.8;
            order.setPrice(order.getPrice() + middlePrice);
        }
    }

    @Test
    public void testExtraPrice() {
        PriceCal extraPriceCal = new ExtraPriceCal();
        extraPriceCal.calculate(order);
        assertEquals(4.8, order.getPrice());
    }
    public class ExtraPriceCal implements PriceCal {
        @Override
        public void calculate(Order order) {
            double extraPrice = order.getDistance() > 8 ? (order.getDistance() - 8) * 1.2 : 0;
            order.setPrice(order.getPrice() + extraPrice);
        }
    }
    
    @Test
    public void testTimePrice() {
        PriceCal timePriceCal = new TimePriceCal();
        timePriceCal.calculate(order);
        assertEquals(1.25, order.getPrice());
    }
    public class TimePriceCal implements PriceCal {
        @Override
        public void calculate(Order order) {
            order.setPrice(order.getPrice() + order.getTime() * 0.25);
        }
    }
```
After this, we should upadte the TaxiFee's calculate function.

```java
    public class TaxiFee implements PriceCal {
    @Override
    public void calculate(Order order) {
        PriceCal startPriceCal = new StartPriceCal();
        PriceCal middlePriceCal = new MiddlePriceCal();
        PriceCal extraPriceCal = new ExtraPriceCal();
        PriceCal timePriceCal = new TimePriceCal();
        startPriceCal.calculate(order);
        middlePriceCal.calculate(order);
        extraPriceCal.calculate(order);
        timePriceCal.calculate(order);
        order.setPrice(Math.round(order.getPrice()));
    }
}
```
Last but not least, run all these test cases and check the result.
![Test 3](https://raw.githubusercontent.com/sunjintw/homework/master/homework1/jinsun/screenshot/Screen%20Shot%202015-12-02%20at%209.55.10%20PM.png)

*This is my first applacation which is followed the TDD process, I still have a lot of confusion of TDD, but I think more close more clear.*
