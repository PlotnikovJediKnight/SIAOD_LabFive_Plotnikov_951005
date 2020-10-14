//Класс-узел-для-хранения-данных
class Node {
    public int data;        //Хранимые данные
    public Node left;       //Ссылка на левое поддерево
    public Node right;      //Cсылка на правое поддерево

    //Конструктор для инициализации
    public Node(int data){
        this.data = data;
        left = null;
        right = null;
    }

    //Выводим ключ
    public void show(){
        System.out.print(data + " ");
    }
}
