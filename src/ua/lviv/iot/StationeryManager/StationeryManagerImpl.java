package ua.lviv.iot.StationeryManager;

import ua.lviv.iot.Stationery.Enams.Quality;
import ua.lviv.iot.Stationery.Stationary;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StationeryManagerImpl {
    private List<Stationary> stationaryList = new ArrayList<>();

    public void addStationary(Stationary stationary) {
        stationaryList.add(stationary);
    }

    public List<Stationary> findForSchoolChildren(Quality qualityOfGoods) {
        return stationaryList.stream().filter(x -> qualityOfGoods.equals(x.getQualityOfGoods())).collect(Collectors.toList());
    }

    public List<Stationary> findForSeniorPupil(Quality qualityOfGoods) {
        return stationaryList.stream().filter(x -> qualityOfGoods.equals(x.getQualityOfGoods())).collect(Collectors.toList());
    }

    public List<Stationary> findForStudent(Quality qualityOfGoods) {
        return stationaryList.stream().filter(x -> qualityOfGoods.equals(x.getQualityOfGoods())).collect(Collectors.toList());
    }

    public List<Stationary> sortByPrice(List<Stationary> list, boolean sortGoods) {
        if(sortGoods) {
            System.out.println("\nSort by price ascending: ");
            list.sort(Comparator.comparing(Stationary::getPriceOfGoods));
        }
        else{
            System.out.println("\n\nSort by price descending: ");
            list.sort(Comparator.comparing(Stationary::getPriceOfGoods).reversed());
        }
        list.forEach(System.out::println);
        return list;
    }

    public List<Stationary> sortByType(List<Stationary> list, boolean sortGoods) {
        if(sortGoods){
            System.out.println("\n\nSort by type ascending: ");
            list.sort(Comparator.comparing(Stationary::getTypeOfGoods));
        }
        else{
            System.out.println("\n\nSort by type descending: ");
            list.sort(Comparator.comparing(Stationary::getTypeOfGoods).reversed());
        }
        list.forEach(System.out::println);
        return list;
    }
}
