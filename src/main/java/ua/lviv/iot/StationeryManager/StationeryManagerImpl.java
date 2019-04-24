package ua.lviv.iot.StationeryManager;

import ua.lviv.iot.Stationery.Enams.Quality;
import ua.lviv.iot.Stationery.Stationary;

import java.util.LinkedList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StationeryManagerImpl {
    private List<Stationary> stationaryList = new LinkedList<>();

    public final List<Stationary> getStationaryList() {
        return stationaryList;
    }

    public final void setStationeryaList(final List<Stationary> stationaryList) {
        this.stationaryList = stationaryList;
    }

    public final void addStationary(final Stationary stationary) {
        stationaryList.add(stationary);
    }

    public final List<Stationary> findForSchoolChildren(
            final Quality qualityOfGoods) {
        return stationaryList.stream().filter(x -> qualityOfGoods
                .equals(x.getQualityOfGoods()))
                .collect(Collectors.toList());
    }

    public final List<Stationary> findForSeniorPupil(
            final Quality qualityOfGoods) {
        return stationaryList.stream().filter(x -> qualityOfGoods
                .equals(x.getQualityOfGoods()))
                .collect(Collectors.toList());
    }

    public final List<Stationary> findForStudent(
            final Quality qualityOfGoods) {
        return stationaryList.stream().filter(x -> qualityOfGoods
                .equals(x.getQualityOfGoods()))
                .collect(Collectors.toList());
    }

    public final List<Stationary> sortByPrice(
            final List<Stationary> list, final boolean sortGoods) {
        if (sortGoods) {
            System.out.println("\nSort by price ascending: ");
            list.sort(Comparator.comparing(Stationary::getPriceOfGoods));
        } else {
            System.out.println("\n\nSort by price descending: ");
            list.sort(Comparator.comparing(Stationary::getPriceOfGoods)
                    .reversed());
        }
        list.forEach(System.out::println);
        return list;
    }

    public final List<Stationary> sortByType(
            final List<Stationary> list, final boolean sortGoods) {
        if (sortGoods) {
            System.out.println("\n\nSort by type ascending: ");
            list.sort(Comparator.comparing(Stationary::getTypeOfGoods));
        } else {
            System.out.println("\n\nSort by type descending: ");
            list.sort(Comparator.comparing(Stationary::getTypeOfGoods)
                    .reversed());
        }
        list.forEach(System.out::println);
        return list;
    }
}
