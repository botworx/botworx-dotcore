using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Mia.Runtime
{
    public struct Proposal
    {
        public Message Message;
        public Expert Expert;
        public MessageCallback Callback;
        public Context Context;
    }
}
