using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Mia.Runtime
{
    public enum MessageKind
    {
        //None,
        Attempt,
        Add,
        Remove,
        Modify,
        Negate,
        Nil,
        Callback
    }
}
