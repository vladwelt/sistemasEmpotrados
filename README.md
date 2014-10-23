cd sistemasEmpotrados

javac -d classes -classpath library/quaqua.jar:library/RXTXcomm.jar vista/*.java controlador/*.java modelo/*.java Inicio.java

cd classes

java -cp ../library/quaqua.jar:. sistemasEmpotrados.Inicio
