using System;
using System.Linq;
using Xunit;

namespace PackingLot.Test
{
    public class PackingLotTest
    {
        [Fact]
        public void CarSucessInPackingLotTest()
        {
            var packingLot = new PackingLot() { Limit = 300 };
            var actual = packingLot.CarIn("京A00000");
            Assert.NotNull(actual);
        }

        [Fact]
        public void CarCanNotInWhenPackingLogGetLimitTest()
        {
            var packingLot = new PackingLot() { Limit = 1 };
            packingLot.CarIn("京B008");

            var actual = packingLot.CarIn("陕A0000");
            Assert.Null(actual);
        }
    }
}
