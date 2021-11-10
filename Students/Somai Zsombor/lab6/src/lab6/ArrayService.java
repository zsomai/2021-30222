package lab6;



public class ArrayService {
    public static void sort(Comparible[] objects, boolean Ascending){
        for(int i = 0; i < objects.length - 1; i++)
            for(int j = i + 1; j < objects.length; j++){
                if(Ascending){
                    if(objects[i].greaterThan(objects[j])){
                        Comparible temp = objects[i]; objects[i] = objects[j]; objects[j] = temp;
                    }
                } else {
                    if (objects[i].smalerThan(objects[j])) {
                        Comparible temp = objects[i];
                        objects[i] = objects[j];
                        objects[j] = temp;
                    }
                }
            }
    }
    public static void printArray(Comparible[] objects){
        for(int i = 0; i < objects.length; i++)
            System.out.println(objects[i].getData());
    }
}
