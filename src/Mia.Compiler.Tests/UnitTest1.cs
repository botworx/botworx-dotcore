using System;
using Xunit;
using System.IO;
using System.Text;

using Mia.Compiler.Parse;
using Mia.Compiler.Transpile;

namespace Mia.Compiler.Tests
{
    public class UnitTest1
    {
        [Fact]
        public void TestLexer()
        {
            string data =
@"
+ Bob likes Cheese
";
            Stream inStream = new MemoryStream(Encoding.UTF8.GetBytes(data));
            Preprocessor preprocessor = new Preprocessor();
            TokenList list = preprocessor.Read(inStream);
            StringWriter writer = new StringWriter();
            list.Print(writer);
            Console.WriteLine(writer.ToString());
        }
        [Fact]
        public void TestAssert()
        {
            string data =
@"
+ Bob likes Cheese
";
            Stream inStream = new MemoryStream(Encoding.UTF8.GetBytes(data));
            Stream outStream = Console.OpenStandardOutput();
            Parser parser = new Parser();
            parser.ParseFile("Test", inStream, new Transpiler(outStream));
        }
    }
}
