package com.university.task.fullstack.dto;


import com.university.task.fullstack.model.Menu;

/**
 * Клас призначений для створення трансферних об'єктів для класу Menu.class
 *
 * @author A.Zapotochnyy
 * @version 1.0
 */
public class MenuDto {
    private Long id;
    private String name;
    private String breakfast;
    private String lunchOne;
    private String dinner;
    private String lunchTwo;
    private String supper;
    private String lunchThree;
    private String date;

    /**
     * Конструктор класу MenuDTO.class без параметрів.
     *
     * @see MenuDto#MenuDto(String, String, String, String, String, String, String, String)
     */
    public MenuDto() {
    }

    /**
     * Конструктор класу MenuDTO.class без параметрів.
     *
     * @param name       ім'я меню.
     * @param breakfast  що на сніданок.
     * @param lunchOne   що на перший перекус.
     * @param dinner     що на сніданок.
     * @param lunchTwo   що на другий перекус.
     * @param supper     що на вечерю.
     * @param lunchThree що на третій перекус.
     * @param date       дата меню.
     * @see MenuDto#MenuDto()
     */
    public MenuDto(String name, String breakfast, String lunchOne, String dinner, String lunchTwo, String supper, String lunchThree, String date) {
        this.name = name;
        this.breakfast = breakfast;
        this.lunchOne = lunchOne;
        this.dinner = dinner;
        this.lunchTwo = lunchTwo;
        this.supper = supper;
        this.lunchThree = lunchThree;
        this.date = date;
    }

    /**
     * Створення статичного класу Builder, щоб із об'єкта класу Menu.class створювати об'єкта класу MenuDTO.class
     */
    public static class Builder {
        MenuDto menuDTO = new MenuDto();

        /**
         * Метод призначений для того, щоб записати в поле "name" об'єкту класу MenuDTO.class значення поля "name" об'єкту класу Menu.class та вернути ссилку на Builder
         *
         * @param menu об'єкта класу Menu.class
         * @return посилання на MenuDTO.Builder
         */
        public Builder setName(Menu menu) {
            menuDTO.setName(menu.getName());
            return this;
        }

        /**
         * Метод призначений для того, щоб записати в поле "breakfast" об'єкту класу MenuDTO.class значення поля "breakfast" об'єкту класу Menu.class та вернути ссилку на Builder
         *
         * @param menu об'єкта класу Menu.class
         * @return посилання на MenuDTO.Builder
         */
        public Builder setBreakfast(Menu menu) {
            menuDTO.setBreakfast(menu.getBreakfast());
            return this;
        }

        /**
         * Метод призначений для того, щоб записати в поле "lunchOne" об'єкту класу MenuDTO.class значення поля "lunchOne" об'єкту класу Menu.class та вернути ссилку на Builder
         *
         * @param menu об'єкта класу Menu.class
         * @return посилання на MenuDTO.Builder
         */
        public Builder setLunchOne(Menu menu) {
            menuDTO.setLunchOne(menu.getLunchOne());
            return this;
        }

        /**
         * Метод призначений для того, щоб записати в поле "dinner" об'єкту класу MenuDTO.class значення поля "dinner" об'єкту класу Menu.class та вернути ссилку на Builder
         *
         * @param menu об'єкта класу Menu.class
         * @return посилання на MenuDTO.Builder
         */
        public Builder setDinner(Menu menu) {
            menuDTO.setDinner(menu.getDinner());
            return this;
        }

        /**
         * Метод призначений для того, щоб записати в поле "lunchTwo" об'єкту класу MenuDTO.class значення поля "lunchTwo" об'єкту класу Menu.class та вернути ссилку на Builder
         *
         * @param menu об'єкта класу Menu.class
         * @return посилання на MenuDTO.Builder
         */
        public Builder setLunchTwo(Menu menu) {
            menuDTO.setLunchTwo(menu.getLunchTwo());
            return this;
        }

        /**
         * Метод призначений для того, щоб записати в поле "supper" об'єкту класу MenuDTO.class значення поля "supper" об'єкту класу Menu.class та вернути ссилку на Builder
         *
         * @param menu об'єкта класу Menu.class
         * @return посилання на MenuDTO.Builder
         */
        public Builder setSupper(Menu menu) {
            menuDTO.setSupper(menu.getSupper());
            return this;
        }

        /**
         * Метод призначений для того, щоб записати в поле "lunchThree" об'єкту класу MenuDTO.class значення поля "lunchThree" об'єкту класу Menu.class та вернути ссилку на Builder
         *
         * @param menu об'єкта класу Menu.class
         * @return посилання на MenuDTO.Builder
         */
        public Builder setLunchThree(Menu menu) {
            menuDTO.setLunchThree(menu.getLunchThree());
            return this;
        }

        /**
         * Метод призначений для того, щоб записати в поле "date" об'єкту класу MenuDTO.class значення поля "date" об'єкту класу Menu.class та вернути ссилку на Builder
         *
         * @param menu об'єкта класу Menu.class
         * @return посилання на MenuDTO.Builder
         */
        public Builder setDate(Menu menu) {
            menuDTO.setDate(menu.getDate());
            return this;
        }

        /**
         * Метод призначений для видачі об'єкту класу МеnuDTO.class
         *
         * @return об'єкт класу МеnuDTO.class
         */
        public MenuDto build() {
            return menuDTO;
        }
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreakfast() {
        return breakfast;
    }

    public void setBreakfast(String breakfast) {
        this.breakfast = breakfast;
    }

    public String getLunchOne() {
        return lunchOne;
    }

    public void setLunchOne(String lunchOne) {
        this.lunchOne = lunchOne;
    }

    public String getDinner() {
        return dinner;
    }

    public void setDinner(String dinner) {
        this.dinner = dinner;
    }

    public String getLunchTwo() {
        return lunchTwo;
    }

    public void setLunchTwo(String lunchTwo) {
        this.lunchTwo = lunchTwo;
    }

    public String getSupper() {
        return supper;
    }

    public void setSupper(String supper) {
        this.supper = supper;
    }

    public String getLunchThree() {
        return lunchThree;
    }

    public void setLunchThree(String lunchThree) {
        this.lunchThree = lunchThree;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "MenuDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", breakfast='" + breakfast + '\'' +
                ", lunchOne='" + lunchOne + '\'' +
                ", dinner='" + dinner + '\'' +
                ", lunchTwo='" + lunchTwo + '\'' +
                ", supper='" + supper + '\'' +
                ", lunchThree='" + lunchThree + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
