cd sistemasEmpotrados
javac -d classes vista/Teclado.java vista/SistemaEmpotrado.java controlador/*.java Inicio.java
cd classes
java -cp ../library/quaqua.jar:. sistemasEmpotrados.Inicio
