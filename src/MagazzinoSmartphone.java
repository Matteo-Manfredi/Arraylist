import java.util.ArrayList;
public class MagazzinoSmartphone {
    private ArrayList <Smartphone> smartphones =new ArrayList <Smartphone>();

    public MagazzinoSmartphone() {
        smartphones = new ArrayList <Smartphone>(10); // Assuming initial capacity of 10
    }

    public MagazzinoSmartphone(MagazzinoSmartphone other) {
            for (int i=0; i<other.smartphones.size();i++){
                if(smartphones.get(i)!=null){
                    smartphones.set(i,other.smartphones.get(i));
                }
        }
    }
    public void addSmartphone(Smartphone smartphone) {
        if(smartphone!=null){
            // smartphones.add(new Smartphone(smartphone));
            smartphones.add(smartphone);
        }
    }

    public void removeSmartphone(Smartphone smartphone) {
        smartphones.remove(smartphone);
    }

    public Smartphone[] getSmartphonesArray() {
        // Arraylist smartphoneArray=(Arraylist)smarthpones.clone;
        // return smartphoneArray;
        return null;
    }


    public Smartphone getSmartphoneByBrand(String brand) {
        int i=0;
        boolean trovato=false;
        while (trovato!=true&&i<smartphones.size()){
         if(smartphones.get(i).getBrand().equals(brand)){
             trovato=true;
         }
         i++;
        }
        if(trovato=true){
         return smartphones.get(i-1);
        }
        else{
         return null;
        }
    }

    public MagazzinoSmartphone getSmartphonesByStorageCapacity(int storageCapacity) {
        // if(!smartphones.isEmpty()){ù
           MagazzinoSmartphone magazzinoSmartphone=new MagazzinoSmartphone();
        for (int x=0; x<smartphones.size();x++){
        int i=0;
        boolean trovato=false;
        while (trovato!=true&&i<smartphones.size()){
         if(smartphones.get(i).getStorageCapacity()==storageCapacity){
             trovato=true;
         }
         i++;
        }
        if(trovato=true){
            magazzinoSmartphone.smartphones.add(smartphones.get(i-1));
        }
    }
        return magazzinoSmartphone;
    }

    public MagazzinoSmartphone getSmartphonesByPriceRange(double minPrice, double maxPrice) {
        MagazzinoSmartphone magazzinoSmartphone = new MagazzinoSmartphone();

        return magazzinoSmartphone;
    }

    @Override
    public String toString() {
        String s="";
        for (int i=0; i<smartphones.size();i++){
                s=s+smartphones.get(i).toString()+"\n";
        }
         return s;
    }

    public int getCount() {
        return smartphones.size();
    }

    public boolean equals(Object obj) {
       

        return true;
    }


}