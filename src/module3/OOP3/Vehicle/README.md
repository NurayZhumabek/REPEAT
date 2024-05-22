Необходимо спроектировать приложение по размещению объявлений о продаже автомобилей.

Реализуйте иерархию классов автомобилей с помощью наследования. В ней должны быть представлены три группы классов:

→ по назначению (грузовые/легковые/пассажирские);

→ по типу кузова (седан/универсал/грузовик/автобус);

→ по типу топлива (бензиновые, дизельные, гибридные и электрические).

Необходимо с помощью наследования реализовать программу, в которой будет один базовый класс VehicleType, три наследника базового класса
(VehicleTypeByPurpose, VehicleTypeByBodyTypes, VehicleTypeByFuelTypes), в которых будeт определено значение поля attribute каждой группы типов, и на каждый класс групп типов — по несколько классов, в которых будет определено конкретное определение типа.

Данный функционал пригодится в случае массовой фильтрации объявлений по какому-то искомому типу.

Также необходимо описать класс VehicleAd:

с базовым набором полей, состоящим из id объявления, model (модели авто) и трех полей с каждым типом,
и AdsService, в котором будет осуществляться фильтрация объявлений.