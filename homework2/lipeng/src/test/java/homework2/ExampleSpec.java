package homework2;

import com.greghaskins.spectrum.Spectrum;
import org.junit.runner.RunWith;

import static com.greghaskins.spectrum.Spectrum.*;
import static homework2.Unit.cm;
import static homework2.Unit.m;
import static homework2.Unit.mm;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(Spectrum.class)
public class ExampleSpec {

    {

        describe("各种单位的长度之间可以比较相等性", () -> {
            it("1m == 1m", () -> {
                assertThat(new Length(1, m)).isEqualTo(new Length(1, m));
            });
            it("1m == 100cm", () -> {
                assertThat(new Length(1, m)).isEqualTo(new Length(100, cm));
            });
            it("1m == 1000mm", () -> {
                assertThat(new Length(1, m)).isEqualTo(new Length(1000, mm));
            });
            it("1.1m == 1100mm", () -> {
                assertThat(new Length(1.1, m)).isEqualTo(new Length(1100, mm));
            });
            it("22cm == 220mm", () -> {
                assertThat(new Length(22, cm)).isEqualTo(new Length(220, mm));
            });
        });

        describe("长度可与数字进行乘除运算", () -> {
            describe("乘法", () -> {
                it("1m x 2 == 2m", () -> {
                    assertThat(new Length(1, m).multiply(2)).isEqualTo(new Length(2, m));
                });
                it("20cm * 2 == 400mm", () -> {
                    assertThat(new Length(20, cm).multiply(2)).isEqualTo(new Length(400, mm));
                });
            });
            describe("除法", () -> {
                it("2m / 2 == 1m", () -> {
                    assertThat(new Length(2, m).divide(2)).isEqualTo(new Length(1, m));
                });
                it("20cm / 2 == 100mm", () -> {
                    assertThat(new Length(20, cm).divide(2)).isEqualTo(new Length(100, mm));
                });
            });
        });

        describe("长度之间可以进行加减运算", () -> {
            describe("加法", () -> {
                it("1m + 2m == 3m", () -> {
                    assertThat(new Length(1, m).add(new Length(2, m))).isEqualTo(new Length(3, m));
                });
                it("20cm + 30mm == 23cm", () -> {
                    assertThat(new Length(20, cm).add(new Length(30, mm))).isEqualTo(new Length(23, cm));
                });
            });
            describe("减法", () -> {
                it("5m - 1m == 4m", () -> {
                    assertThat(new Length(5, m).minus(new Length(1, m))).isEqualTo(new Length(4, m));
                });
                it("3000mm - 100cm == 200cm", () -> {
                    assertThat(new Length(3000, mm).minus(new Length(100, cm))).isEqualTo(new Length(200, cm));
                });
            });
        });
    }
}
