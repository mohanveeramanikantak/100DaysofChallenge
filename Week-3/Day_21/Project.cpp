#include <iostream>
#include <vector>
#include <string>

// Structure to store passenger details
struct Passenger {
    std::string name;
    int seatNumber;
};

// Class to handle the Bus Reservation System
class BusReservationSystem {
private:
    int totalSeats;
    std::vector<bool> seatAvailability;
    std::vector<Passenger> passengers;

public:
    BusReservationSystem(int seats) : totalSeats(seats) {
        seatAvailability.resize(seats, true); // All seats are initially available
    }

    // Function to book a seat
    void bookSeat() {
        Passenger newPassenger;
        std::cout << "Enter passenger name: ";
        std::cin.ignore();
        std::getline(std::cin, newPassenger.name);

        std::cout << "Enter seat number to book (1-" << totalSeats << "): ";
        std::cin >> newPassenger.seatNumber;

        if (newPassenger.seatNumber < 1 || newPassenger.seatNumber > totalSeats) {
            std::cout << "Invalid seat number. Please try again.\n";
            return;
        }

        if (seatAvailability[newPassenger.seatNumber - 1]) {
            seatAvailability[newPassenger.seatNumber - 1] = false;
            passengers.push_back(newPassenger);
            std::cout << "Seat " << newPassenger.seatNumber << " booked successfully for " << newPassenger.name << "!\n";
        } else {
            std::cout << "Seat " << newPassenger.seatNumber << " is already booked. Please choose another seat.\n";
        }
    }

    // Function to view the current reservation status
    void viewReservations() const {
        std::cout << "\n---- Current Reservation Status ----\n";
        for (int i = 0; i < totalSeats; ++i) {
            if (seatAvailability[i]) {
                std::cout << "Seat " << (i + 1) << ": Available\n";
            } else {
                std::cout << "Seat " << (i + 1) << ": Booked\n";
            }
        }
    }

    // Function to cancel a reservation
    void cancelReservation() {
        int seatNumber;
        std::cout << "Enter seat number to cancel (1-" << totalSeats << "): ";
        std::cin >> seatNumber;

        if (seatNumber < 1 || seatNumber > totalSeats) {
            std::cout << "Invalid seat number. Please try again.\n";
            return;
        }

        if (!seatAvailability[seatNumber - 1]) {
            seatAvailability[seatNumber - 1] = true;

            for (auto it = passengers.begin(); it != passengers.end(); ++it) {
                if (it->seatNumber == seatNumber) {
                    passengers.erase(it);
                    break;
                }
            }

            std::cout << "Seat " << seatNumber << " reservation canceled successfully!\n";
        } else {
            std::cout << "Seat " << seatNumber << " is already available. No cancellation needed.\n";
        }
    }
};

int main() {
    int totalSeats;
    std::cout << "Enter total number of seats on the bus: ";
    std::cin >> totalSeats;

    BusReservationSystem bus(totalSeats);
    char choice;

    do {
        std::cout << "\n---- Bus Reservation Menu ----\n";
        std::cout << "1. Book a Seat\n";
        std::cout << "2. View Reservations\n";
        std::cout << "3. Cancel a Reservation\n";
        std::cout << "4. Exit\n";
        std::cout << "Enter your choice: ";
        std::cin >> choice;

        switch (choice) {
            case '1':
                bus.bookSeat();
                break;
            case '2':
                bus.viewReservations();
                break;
            case '3':
                bus.cancelReservation();
                break;
            case '4':
                std::cout << "Exiting the Bus Reservation System. Thank you!\n";
                break;
            default:
                std::cout << "Invalid choice! Please select a valid option.\n";
        }
    } while (choice != '4');

    return 0;
}
