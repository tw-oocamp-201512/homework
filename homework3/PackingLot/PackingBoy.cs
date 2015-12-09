using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PackingLot
{
    public class PackingBoy
    {
        private readonly List<PackingLot> _packingLots;

        public PackingBoy(List<PackingLot> packingLots)
        {
            this._packingLots = packingLots;
        }

        public PackingBoy(int packingLotsCount)
        {
            _packingLots = new List<PackingLot>();
            for (int i = 0; i < packingLotsCount; i++)
            {
                _packingLots.Add(new PackingLot());
            }
        }

        public Ticket PackingCar(string carNum)
        {
            Ticket ticket = null;
            _packingLots.ForEach(p =>
            {
                var t = p.CarIn(carNum);
                if (t != null)
                {
                    ticket = t;
                }
            });
            return ticket;
        }

        public bool GetCar(Ticket ticket)
        {
            return _packingLots.Any(packingLot => packingLot.CarOut(ticket));
        }
    }
}
