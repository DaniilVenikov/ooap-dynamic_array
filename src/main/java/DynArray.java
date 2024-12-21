public abstract class DynArray<T> {

    public static int INCREASE_CAPACITY_OK = 1;
    public static int INCREASE_CAPACITY_ERR = 2;

    public static int APPEND_NIL = 0;
    public static int APPEND_OK = 1;
    public static int APPEND_ERR = 2;

    public static int REMOVE_NIL = 0;
    public static int REMOVE_OK = 1;
    public static int REMOVE_ERR = 2;

    public static int GET_NIL = 0;
    public static int GET_OK = 1;
    public static int GET_ERR = 2;

    // конструктор
    //постусловие: создан новый динамический массив с заданной начальной вместимостью
    public abstract DynArray<T> DynArray(int capacity);

    // команды

    // предусловие: массив не пустой
    // постусловие: увеличит вместимость массива в 2 раза
    public abstract void increaseCapacity();

    // предусловие: в массиве есть свободное место
    // постусловие: добавляет в конец массива новый элемент
    public abstract void append(T item);

    // предусловие: массив не пустой
    // постусловие: удаляет последний элемент из массива
    public abstract void remove();


    // запросы

    // предусловие: переданный индекс больше или равен нулю и меньше количества элементов в массиве
    public abstract T getItem(int index);

    public abstract int getIncreaseCapacityStatus();
    public abstract int getAppendStatus();
    public abstract int getRemoveStatus();
    public abstract int getGetStatus();
}
