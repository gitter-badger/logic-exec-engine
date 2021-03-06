/*
 * MIT License
 *
 * Copyright (c) 2018 topic.systems
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package systems.topic.lee

/**
  * @author Chenai Nakam(chenai.nakam@gmail.com)
  * @version 1.0, 31/07/2018
  */
class Dsl {
  val value = 12345

  abcd(new GasCounter(100))

  def abcd(counter: GasCounter): Boolean = {
    //    counter.++
    if (counter.++ / 2 == 0)
      counter.isOutOfGas
    else false
  }

  org.objectweb.asm.Opcodes.ALOAD
  // scala.tools.asm.Opcodes.ALOAD
  org.apache.bcel.Const.ALOAD

  class MyCLoader extends ClassLoader {
    // jar 文件的加载是这么来的：sun.net.www.protocol.jar.JarURLConnection.JarURLInputStream.JarURLInputStream

    override def findClass(name: String) = super.findClass(name)

    override def findResource(name: String) = super.findResource(name)

    override def findResources(name: String) = super.findResources(name)
  }
}
