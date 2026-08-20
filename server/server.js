const express = require('express');
const cors = require('cors');
const mongoose = require('mongoose');
const dotenv = require('dotenv');
const errorHandler = require('./middleware/errorHandler');

dotenv.config();

const app = express();
app.get("/", (req, res) => {
  res.send("Travelora backend is running successfully!");
});
const PORT = process.env.PORT || 5000;
const MONGO_URI = process.env.MONGO_URI || 'mongodb://127.0.0.1:27017/travelora';

// Middleware
app.use(cors());
app.use(express.json());

// Health Check API
app.get('/api/health', (req, res) => {
  res.json({
    status: 'online',
    system: 'TRAVELORA API',
    time: new Date().toISOString(),
    demoMode: mongoose.connection.readyState !== 1
  });
});

// Register Routes
app.use('/api/auth', require('./routes/auth'));
app.use('/api/destinations', require('./routes/destinations'));
app.use('/api/packages', require('./routes/packages'));
app.use('/api/hotels', require('./routes/hotels'));
app.use('/api/bookings', require('./routes/bookings'));
app.use('/api/reviews', require('./routes/reviews'));
app.use('/api/admin', require('./routes/admin'));

// Error Handler Middleware
app.use(errorHandler);

// Connect to MongoDB with graceful fallback for academic demo
const startServer = async () => {
  try {
    mongoose.set('strictQuery', false);
    await mongoose.connect(MONGO_URI, {
      serverSelectionTimeoutMS: 2000,
    });
    console.log('[Travelora] ✓ Connected to MongoDB successfully.');
  } catch (err) {
    console.log('[Travelora] ℹ MongoDB is not running locally. Seamlessly running in Academic Demo Mode with local datasets.');
  }

  app.listen(PORT, () => {
    console.log(`[Travelora Server] Running at http://localhost:${PORT}`);
  });
};

startServer();
