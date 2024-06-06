-- phpMyAdmin SQL Dump
-- version 5.2.1-4.fc40
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Jun 05, 2024 at 10:43 PM
-- Server version: 10.11.6-MariaDB
-- PHP Version: 8.3.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `aplikasi_scm`
--

-- --------------------------------------------------------

--
-- Table structure for table `pengiriman`
--

CREATE TABLE `pengiriman` (
  `nomor` int(11) NOT NULL,
  `kode_pemesanan` varchar(50) NOT NULL,
  `pelanggan` varchar(100) NOT NULL,
  `jenis_produk` varchar(50) NOT NULL,
  `biaya_kirim` decimal(10,2) NOT NULL,
  `jasa_kirim` varchar(50) NOT NULL,
  `tanggal_kirim` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_general_ci;

--
-- Dumping data for table `pengiriman`
--

INSERT INTO `pengiriman` (`nomor`, `kode_pemesanan`, `pelanggan`, `jenis_produk`, `biaya_kirim`, `jasa_kirim`, `tanggal_kirim`) VALUES
(1, 'ORD001', 'John Doe', 'Electronics', 50.00, 'DHL', '2024-06-01'),
(2, 'ORD002', 'Jane Smith', 'Books', 20.50, 'FedEx', '2024-06-02'),
(3, 'ORD003', 'Alice Johnson', 'Clothing', 15.75, 'UPS', '2024-06-03'),
(4, 'ORD004', 'Bob Brown', 'Furniture', 200.00, 'TNT', '2024-06-04'),
(5, 'ORD005', 'Charlie Davis', 'Toys', 10.00, 'USPS', '2024-06-05'),
(6, 'ORD006', 'John Smith', 'deterjeen', 12000.00, 'Cepat', '2024-06-30');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `pengiriman`
--
ALTER TABLE `pengiriman`
  ADD PRIMARY KEY (`nomor`),
  ADD KEY `kode_pengiriman` (`nomor`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `pengiriman`
--
ALTER TABLE `pengiriman`
  MODIFY `nomor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
