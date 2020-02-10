using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Mia.Compiler.Ast
{
    public class BrainDef : ExpertDef
    {
        public BrainDef(Token name, Token baseName)
            : base(name, baseName)
        {
            NodeKind = AstNodeKind.BrainDef;
        }
    }
}
