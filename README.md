# TRAVELORA — Smart Travel Booking System

> **"Plan less. Travel more."**  
> An academic, modern, centralized travel discovery and booking platform built with **React**, **Tailwind CSS**, **Node.js**, **Express**, and **MongoDB**.

---

## 📌 Problem Statement
Travel information, flight options, hotel bookings, and tour packages are often scattered across disparate platforms. **TRAVELORA** provides a unified, centralized travel booking experience that simplifies destination search, curated package reservations, transparent cost breakdowns, and itinerary management.

---

## 🚀 Key Features

### 🌟 1. Premium Frontend UI/UX
- **Modern Luxury Aesthetic**: Styled with Deep Navy (`#0B1F33`), Sky Blue (`#2F80ED`), and Warm Orange (`#FF8A3D`).
- **Dynamic Hero & Search Tabs**: Switch between Packages, Hotels, and Flights with location, dates, and budget selectors.
- **Personalized Recommendations**: "Trips you might love" matched to user travel styles and budget preferences.
- **Travel Inspiration Section**: Editorial guides and travel tips.
- **Verified Reviews**: Authentic traveler testimonials.

### 🧭 2. Exploration & Filtering
- **Destinations (`/destinations`)**: Filter by category (*Beach, Mountains, Nature, Heritage, Adventure, City*), price slider, and rating.
- **Destination Details (`/destinations/:id`)**: Best time to visit, estimated budget, top attractions, things to do, and matching holiday packages.
- **Packages (`/packages`)**: Multi-day all-inclusive holiday packages with full day-by-day itineraries and inclusions/exclusions.
- **Hotels (`/hotels`)**: Search by city, check-in date, rating, and amenity filters (*Pool, Spa, Beachfront, Mountain View*).

### 💳 3. Realistic 7-Step Booking Flow
1. **Package & Room Selection** (Standard, Premium, Luxury Villa)
2. **Travel Dates & Guest Count**
3. **Lead Booker & Passenger Details**
4. **Review & Travel Insurance Add-on**
5. **Simulated Payment Gateway** (UPI / Card / NetBanking)
6. **Processing Animation**
7. **Confirmed Booking Voucher** with unique Booking ID (e.g. `TRV-2026-94812`), printable summary receipt, and celebration confetti.

### 📊 4. Dynamic Transparent Price Breakdown
- Dynamically itemizes:
  - Base Package Price × Travellers
  - Accommodation Upgrade Tier
  - Comprehensive Insurance
  - Goods & Services Tax (12% GST)
  - Convenience Service Fee
  - Promo Discount (e.g., `TRAVEL500`, `TRAVEL1000`)
  - Net Payable Total

### 🛡️ 5. User Account & Admin Dashboard
- **My Trips (`/my-trips`)**: Manage Upcoming, Completed, and Cancelled trips with instant voucher downloading.
- **Wishlist (`/wishlist`)**: Real-time heart-saved items across packages, destinations, and hotels.
- **Profile (`/profile`)**: Manage contact info and personalized travel preferences.
- **Admin Dashboard (`/admin`)**: Visual KPI metrics (Revenue, Bookings, Users, Packages), monthly volume bar chart, popular destination shares, and full Package Inventory CRUD.

### 🎓 6. Built-in Academic Demo Mode
- **Zero-Setup Resilience**: Works out of the box even if MongoDB is not running locally. The frontend and backend automatically fallback to rich demo datasets and local storage.

---

## 🛠️ Technology Stack

| Layer | Technologies |
| :--- | :--- |
| **Frontend** | React 18, Vite, Tailwind CSS, Lucide React Icons, React Router v6, Canvas Confetti |
| **Backend** | Node.js, Express.js, REST APIs, JSON Web Tokens (JWT), Bcrypt.js |
| **Database** | MongoDB & Mongoose (with Demo Mode fallback) |

---

## 📁 Project Structure

```
travelora/
│
├── client/                      # Frontend React application
│   ├── src/
│   │   ├── components/          # Reusable UI components (Navbar, Footer, Hero, Cards...)
│   │   ├── pages/               # Pages (Home, Destinations, Packages, Booking, Admin...)
│   │   ├── layouts/             # MainLayout with sticky header & footer
│   │   ├── data/                # Sample datasets for destinations, packages, hotels...
│   │   ├── services/            # API and local storage wrappers
│   │   ├── hooks/               # Auth and Wishlist context providers
│   │   ├── utils/               # Currency, date, and dynamic price calculators
│   │   ├── App.jsx              # Client router
│   │   ├── main.jsx             # React entry point
│   │   └── index.css            # Tailwind & print styles
│   ├── index.html
│   ├── package.json
│   ├── tailwind.config.js
│   └── vite.config.js
│
├── server/                      # Backend REST API
│   ├── models/                  # Mongoose models (User, Destination, Package, Hotel, Booking, Review)
│   ├── routes/                  # Express REST routes
│   ├── controllers/             # Business logic handlers
│   ├── middleware/              # JWT Auth & Error handling
│   ├── data/                    # demoData.json
│   ├── server.js                # Server entry point
│   └── package.json
│ 
├── booking-server   
├── package.json                 # Root script runner
├── README.md
└── .gitignore
```

---

## 💻 How to Run the Project

### Prerequisites
- Node.js (v18 or higher recommended)
- npm

### 1. Install Dependencies
In the root `travelora` directory, run:
```bash
# Install root, client, and server dependencies
npm run install:all
```
*(Or navigate to `client` and `server` folders individually and run `npm install`)*

### 2. Start the Development Servers

To run both Frontend and Backend concurrently from the root folder:
```bash
npm run dev
```

Or run them in separate terminal tabs:

**Terminal 1 (Backend):**
```bash
cd server
npm start
# Runs at http://localhost:5000
```

**Terminal 2 (Frontend):**
```bash
cd client
npm run dev
# Runs at http://localhost:5173
```
---
## 👨‍💻 Author

### **Lokesh Patil**
*BE Information Technology | Full-Stack Developer*

🚀 **Travelora** is a full-stack Smart Travel Booking System developed by **Lokesh Patil** as a web development project.

**Tech Stack:**  
`React.js` • `Vite` • `Tailwind CSS` • `Node.js` • `Express.js` • `MongoDB` • `Mongoose` • `REST API`

🎓 **Department of Information Technology**  
**K. C. College of Engineering and Management Studies & Research**

> *Built with the goal of creating a modern, scalable and user-friendly travel booking experience.*
---

## 🔑 Demo Credentials

| Role | Email | Password |
| :--- | :--- | :--- |
| **Admin** | `admin@travelora.com` | `admin123` |
| **Traveler** | `user@travelora.com` | `travelora123` |

*(Or enter any name/email during signup or checkout)*

---

## 👨‍🏫 Evaluation & Presentation Tips
- Show the **Homepage Hero Search tabs** and live search filters.
- Walk through the **7-Step Booking Flow** on any package (e.g. *Goa Escape* or *Kashmir Paradise*).
- Demonstrate the **Dynamic Price Breakdown** with Promo Code `TRAVEL500`.
- Show the **Print/Download Voucher** on confirmation.
- Open `/admin` to show **KPI Metrics**, **Monthly Trends Chart**, and **Package Management**.
