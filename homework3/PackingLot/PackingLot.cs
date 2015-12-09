using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PackingLot
{
    public class PackingLot
    {
        public PackingLot()
        {
            this.Limit = 300;
            _sendedTickets = new List<Ticket>();
        }

        public int Limit { get; set; }

        private readonly List<Ticket> _sendedTickets;

        public Ticket CarIn(string carNumber)
        {
            if (_sendedTickets.Count < Limit)
            {
                var ticket = new Ticket(carNumber);
                _sendedTickets.Add(ticket);
                return ticket;
            }
            else
            {
                return null;
            }
        }

        public bool CarOut(Ticket ticket)
        {
            if (_sendedTickets.Contains(ticket))
            {
                return false;
            }
            else
            {
                _sendedTickets.Remove(ticket);
                return true;
            }
        }
    }
}
