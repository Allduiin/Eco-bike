package test.task.eco_bike.service;

import test.task.eco_bike.model.abstraction.Bike;

public interface MainService {
    void showCatalog();

    void AddNewFoldingBike();

    void AddNewSpeedelec();

    void AddNewEBike();

    void Search();

    void WriteToFile();
}
