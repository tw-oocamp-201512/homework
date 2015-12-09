using System;
using System.Collections.Generic;
using System.Linq;
using Xunit;

namespace PackingLot.Test
{
    public class PackingBoyTest
    {
        [Fact]
        public void SuccessPackToFirstValidPackingLotTest()
        {
            var packingBoy = new PackingBoy(10);
            var actual = packingBoy.PackingCar("xxx");
            Assert.NotNull(actual);
        }

        [Fact]
        public void FailedPackingWhenAllPackingLotsAreFullTest()
        {
            var packingLots = new List<PackingLot>();
            packingLots.Add(new PackingLot() { Limit = 1 });
            var packingBoy = new PackingBoy(packingLots);
            packingBoy.PackingCar("xxx");
            var actual = packingBoy.PackingCar("ooo");
            Assert.Null(actual);
        }

        [Fact]
        public void SucessGetCarWhenCarWasInAnyOfPackingLotTest()
        {
            var packingBoy = new PackingBoy(10);
            var ticket = packingBoy.PackingCar("xxx");
            var actual = packingBoy.GetCar(ticket);

            Assert.True(actual);
        }

        [Fact]
        public void FailedGetCarWhenCarWasInAnyOfPackingLotTest()
        {
            var packingBoy = new PackingBoy(10);
            var ticket = new Ticket("invalid ticket");
            var actual = packingBoy.GetCar(ticket);

            Assert.False(actual);
}
    }
}
