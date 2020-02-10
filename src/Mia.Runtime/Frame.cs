using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Mia.Runtime
{
    class Frame
    {
        public List<Message> Messages = new List<Message>();
        public void Add(Message msg)
        {
            Messages.Add(msg);
        }
    }
}
