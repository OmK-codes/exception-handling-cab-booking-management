package com.omkcodes.project.model;

public class Passenger {
        private String passengerId;
        private String passengerName;
        private String email;
        private String phone;
        private String address;

        public String getPassengerName() {
            return passengerName;
        }

        public void setPassengerName(String passengerName) {
            this.passengerName = passengerName;
        }

        @Override
        public String toString() {
            return "Passenger{" +
                    "passengerId='" + passengerId + '\'' +
                    ", passengerName='" + passengerName + '\'' +
                    ", email='" + email + '\'' +
                    ", phone='" + phone + '\'' +
                    ", address='" + address + '\'' +
                    '}';
        }

        public String getPassengerId() {
            return passengerId;
        }

        public void setPassengerId(String passengerId) {
            this.passengerId = passengerId;
        }

        public String getName() {
            return passengerName;
        }

        public void setName(String name) {
            this.passengerName = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(int phone) {
            this.phone = String.valueOf(phone);
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
}