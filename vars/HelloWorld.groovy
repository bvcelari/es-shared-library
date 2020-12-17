def call(String mydata) {
  println "Hello World!!"
  println mydata
  File file = new File("/tmp/out.txt")
  file.write "First line\n"
  file << "Second line\n"
  println file.text

}
