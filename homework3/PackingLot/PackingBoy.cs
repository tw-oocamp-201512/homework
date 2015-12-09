using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PackingLot
{
    public class PackingBoy
    {
        private List<PackingLot> packingLots;

        public PackingBoy(List<PackingLot> packingLots)
        {
            this.packingLots = packingLots;
        }

        public PackingBoy(int packingLotsCount)
        {
            packingLots = new List<PackingLot>();
            for (int i = 0; i < packingLotsCount; i++)
            {
                packingLots.Add(new PackingLot());
            }
        }

        public Ticket PackingCar(string carNum)
        {
            Ticket ticket = null;
            packingLots.ForEach(p =>
            {
                var t = p.CarIn(carNum);
                if (t != null)
                {
                    ticket = t;
                }
            });
            return ticket;
        }
    }
}
