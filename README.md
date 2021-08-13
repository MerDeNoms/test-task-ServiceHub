# test-task-ServiceHub
Test task done for ServiceHub company by Kuzmin Aleksandr

### Чек-дист задания
- [x] 1. Залогинится на udemy
- [x] 2. Набрать в поиске selenium
- [x] 3. Взять первый курс, добавить его в корзину
- [x] 4. Перейти в корзину и проверить, что он уже там есть

## Запуск проекта - установка ПО
Для запуска проетка необходимо установить следующее ПО, скачать которое можно найти по ссылкам:
* Java SE 11 (LTS)  https://www.oracle.com/java/technologies/javase-jdk11-downloads.html
* IntelliJ IDEA Community Edition (Версия: 2021.2 Сборка: 212.4746.92 27 июля 2021 г.) https://www.jetbrains.com/ru-ru/idea/download
* Apache Maven (3.8.1) https://mirror.linux-ia64.org/apache/maven/maven-3/3.8.1/binaries/apache-maven-3.8.1-bin.zip
* ChromeDriver (92.0.4515.107)  https://chromedriver.storage.googleapis.com/92.0.4515.107/chromedriver_win32.zip

Установка ПО происходит в интерактивном режиме, кроме Apache Maven и ChromeDriver

### Установка Maven
Установка описана в файле README.txt в папке фреймворка. Для установки необходимо выолнить следующие шаги:
1. Распаковать скачанный архив
2. Добавить в переменную среды Path путь к исполняемыми файлами (подставьте в команды папку с вашей версией Maven вместо program files в примерах ниже)
   * Для ОС UNIX-семейства (Linux, Solaris and Mac OS X)
     * export PATH=/usr/local/apache-maven-3.x.y/bin:$PATH
   * Для Windows
     * set PATH="c:\program files\apache-maven-3.x.y\bin";%PATH%
4. Добавить переменную среды JAVA_HOME путь к дирректории с установленным JDK
5. Выполнить в консоли ```mvn --version```, чтобы убедится, что Apache Maven установлен

### Установка ChromeDriver
Установка почти не отличается от Maven
1. Распаковать скачанный архив
2. Добавить в переменную среды Path путь к файлу драйвера
#### Примечание: рапаковать папку с ChromeDriver можно в любом месте, но лучше где-нибудь в удобном пути для копирования этого пути в проект

## Запуск проекта - Работа с IDE 'IntelliJ IDEA'
После устанвоки ПО скачайте проект с репозитория. Далее запустите IDE 'IntelliJ IDEA'
В открывшемся окне программы выберите опцию 'Open' для открытия проекта

![image](https://user-images.githubusercontent.com/38666808/129273837-c01218a1-40d1-4c98-92e3-b822371f8054.png)

В диалоговом окней найдите директорию скачанного проекта и откройте проект
В окне проекта (слева) откройте файл pom.xml

![image](https://user-images.githubusercontent.com/38666808/129274106-ff61cc50-5f09-45c8-a288-e8ac0d0a8726.png)


Справа внизу появится окно с подсказкой о существующем файле скрипта Maven, выбирете опцию 'Load'

![image](https://user-images.githubusercontent.com/38666808/129278829-8ef2f548-8c94-4ecc-aa4a-fdf0184e2347.png)


Откройте меню Maven (справа) и разрешите зависимости кликом по исконке 'Download Sources and/or Documentation' А затем по опции 'Download Sources'

![image](https://user-images.githubusercontent.com/38666808/129278428-3a084e59-98bd-48e9-b8f7-b780f9c6641a.png)

Разрешите Работу с проектом кликнув на 'Trust project...' над редактором кода

![image](https://user-images.githubusercontent.com/38666808/129278957-07aa5bb1-c420-465f-a4cb-83acecd35ebe.png)


Если JDK не подключился автоматически выберете 'Setup SDK' над редактором кода (в том же месте, где и предыдущий шаг)
Добавьте конфтгурацию запуска 'Add Configuration' над редактором кода
В появившемся окне кликните по 'Add new run configuration' -> 'Application'

![image](https://user-images.githubusercontent.com/38666808/129279181-2e717ade-ac64-4866-8b41-1e18aa60e7c5.png)

Далее в появившемся окне необходимо настроить параметры запуска

![image](https://user-images.githubusercontent.com/38666808/129279442-1dcd3f9a-55de-40b3-a170-95c28c6e174a.png)

![image](https://user-images.githubusercontent.com/38666808/129279317-cbd3c0d1-8e86-49fa-a45d-d96cca6806bb.png)

![image](https://user-images.githubusercontent.com/38666808/129279382-6733a8f7-85ce-4098-9ae9-5afb782bacfb.png)

На 14-й строке нужно указать путь к драйверу для его запуска

![image](https://user-images.githubusercontent.com/38666808/129280280-bcf692ff-a3b4-403b-993e-eb6c75038135.png)


Затем нужно запустить программу
#### Примечание: если во время выполнения появляется окно с капчей, то программу нужно остановить, решить капчу, закрыть тестовый браузер и снова запустить программу.

## Результат тестового задания
По завершению теста в консоль выодится сообщение 'Test passed'

![image](https://user-images.githubusercontent.com/38666808/129280118-e819229c-dfd7-4043-86ff-653283c78406.png)
