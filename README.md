cd sistemasEmpotrados

javac -d classes -classpath library/quaqua.jar vista/*.java controlador/*.java Inicio.java

cd classes

java -cp ../library/quaqua.jar:. sistemasEmpotrados.Inicio
