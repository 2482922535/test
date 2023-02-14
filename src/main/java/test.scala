object test {
  val str = "hello"

  def main(args: Array[String]): Unit = {
    for (i <- 1 to 10)
      println(i)
  }

  for (c <- str)
    println(c)

}
