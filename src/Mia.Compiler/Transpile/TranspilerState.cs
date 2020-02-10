using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

using Mia.Compiler.Ast;

namespace Mia.Compiler.Transpile
{
    public class TranspilerState
    {
        public Stmt Stmt;
        public TranspilerState(Stmt statement)
        {
            Stmt = statement;
        }
    }
}
