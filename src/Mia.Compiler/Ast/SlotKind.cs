using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Mia.Compiler.Ast
{
    public enum SlotKind
    {
        //Dynamic = -1,//Bad Idea.  Cast to enum value type elsewhere.
        Subject = 0,
        Predicate,
        Object
    }
}
