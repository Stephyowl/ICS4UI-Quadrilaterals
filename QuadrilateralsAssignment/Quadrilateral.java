
abstract class Quadrilateral {
	abstract int findArea();
	abstract int findPerimeter();
	
}
class Square extends Quadrilateral{
	private int side1;
	Square(){
		side1 = 0;
	}
	int findPerimeter() {
		return side1*4;
	}
	int findArea() {
		return side1*side1;
	}
	public int getSide1(){
		return side1;
	}
	public void setSide1(int side1){
		this.side1 = side1;
	}
	public String toString(){

	}
	public boolean equals(Object object){
		if(){
			return true;
		}
		return false;
	}

}
class Rhombus extends Square{
	private int height;
	Rhombus(){
		height = 0;
	}
	int findPerimeter() {
		return super.getSide1()*4;
	}
	int findArea() {
		return super.getSide1()*super.getSide1();
	}
	public int getHeight(){
		return height;
	}
	public void setHeight(int height){
		this.height = height;
	}
	public String toString(){

	}
	public boolean equals(Object object){
		if(){
			return true;
		}
		return false;
	}
}
class Rectangle extends Square{
	private int side2;
	Rectangle(){
		side2 = 0;
	}
	int findPerimeter() {
		return (super.getSide1()+side2)*2;
	}
	int findArea() {
		return super.getSide1()*side2;
	}
	public int getSide2(){
		return side2;
	}
	public void setSide2(int side2){
		this.side2 = side2;
	}
	public String toString(){

	}
	public boolean equals(Object object){
		if(){
			return true;
		}
		return false;
	}
}
class Parallelogram extends Rectangle{
	private int height;
	Parallelogram(){
		height = 0;
	}
	int findPerimeter() {
		return (super.getSide1()+super.getSide2())*2;
	}
	int findArea() {
		return super.getSide1()*height;
	}
	public int getHeight(){
		return height;
	}
	public void setHeight(int height){
		this.height = height;
	}
	public String toString(){

	}
	public boolean equals(Object object){
		if(){
			return true;
		}
		return false;
	}
}


class Kite extends Rectangle{
	private int dia1, dia2;
	Kite(){
		dia1 = 0;
		dia2 = 0;
	}
	int findPerimeter() {
		return (super.getSide1()+super.getSide2())*2;
	}
	int findArea() {
		return (dia1*dia2)/2;
	}
	public int getDia1() {
		return dia1;
	}
	public int getDia2() {
		return dia2;
	}
	public void setDia1(int dia1) {
		this.dia1 = dia1;
	}
	public void setDia2(int dia2) {
		this.dia2 = dia2;
	}
	public String toString(){

	}
	public boolean equals(Object object){
		if(){
			return true;
		}
		return false;
	}
}
class Trapezoid extends Parallelogram{
	private int side3, side4;
	Trapezoid(){
		side3 = 0;
		side4 = 0;
	}
	int findPerimeter() {
		return super.getSide1()+super.getSide2()+getSide3()+getSide4();
	}
	int findArea() {
		return (super.getSide1()+super.getSide2())/2;
	}
	public int getSide3() {
		return side3;
	}
	public int getSide4() {
		return side4;
	}
	public void setSide3(int side3) {
		this.side3 =side3;
	}
	public void setSide4(int side4) {
		this.side4 =side4;
	}
	public String toString(){
		
	}
	public boolean equals(Object object){
		if(){
			return true;
		}
		return false;
	}
}