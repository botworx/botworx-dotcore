using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Mia.AgentLib.ClientLib
{
    public abstract class Proxy
    {
        public Client Client;
        public Guid Guid;
    }
    public class Proxy<OuterT> : Proxy
    {
        protected OuterT Outer;
        //
        protected Proxy(Client client, OuterT outer, Guid guid)
        {
            Client = client;
            Outer = outer;
            Guid = guid;
        }
    }
}
