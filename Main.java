import java.util.LinkedHashSet;
import java.util.Random;

//СИАОД, Лабораторная работа №5
//Бинарное дерево поиска
//Плотников Владислав, гр. 951005

public class Main {
    public static void main(String[] args){
        //Объект для генерации случайных чисел
        Random rand = new Random();
        //LinkedHashSet для исключения дубликатов ключей. Также сохраняет порядок вставки
        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
        //Создаем двоичное дерево
        BinTree tree = new BinTree();

        //Создаем 1000 ключей и кладем их во множество
        for (int i = 0; i < 1000; i++)
            set.add(rand.nextInt(100));
        //Проходимся по множеству и каждый его элемент вставляем в дерево двоичного поиска
        System.out.println("Порядок вставки элементов в двоичное дерево поиска: ");
        for (Integer it : set){
            System.out.print(it + " ");
            tree.insert(it);
        }
        System.out.println();

        //Симметричный обход
        tree.getInOrder();
        //Прямой обход
        tree.getPreOrder();
        //Обратный обход
        tree.getPostOrder();

        //Берем примерно половину первых элементов вставленных и удаляем её
        //из дерева
        int k = set.size() / 2;
        for (Integer it : set){
            tree.delete(it);
            k--;
            if (k == 0) break;
        }

        //Делаем ещё раз симметричный обход
        System.out.println("После удаления половины элементов:");
        tree.getInOrder();

        //Демонстрация поиска элементов в дереве (поскольку первая половина удалена, то
        //первая половина попыток поиска безуспешна)
        System.out.println("Ищем элементы в дереве:");
        for (Integer it : set){
            System.out.println(it + (tree.find(it) != null ? " found!" : " not found!"));
        }
    }
}
