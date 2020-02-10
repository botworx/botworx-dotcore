﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Mia.Compiler
{
    [Flags]
    public enum MatchFlag : int
    {
        None = 0,
        SubjectX = 1,
        PredicateX = 2,
        ObjectX = 4,
    }
}
