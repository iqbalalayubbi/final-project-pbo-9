-- phpMyAdmin SQL Dump
-- version 5.2.1-4.fc40
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Jun 19, 2024 at 05:10 PM
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
-- Table structure for table `persediaan`
--

CREATE TABLE `persediaan` (
  `nomor` int(11) NOT NULL,
  `id_barang` varchar(50) NOT NULL,
  `nama_barang` varchar(100) NOT NULL,
  `kategori` varchar(50) NOT NULL,
  `lokasi` varchar(100) NOT NULL,
  `exp_date` date NOT NULL,
  `jumlah` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_general_ci;

--
-- Dumping data for table `persediaan`
--

INSERT INTO `persediaan` (`nomor`, `id_barang`, `nama_barang`, `kategori`, `lokasi`, `exp_date`, `jumlah`) VALUES
(48, 'BRG001', 'Laptop', 'Elektronik', 'Gudang A', '2024-12-01', 100),
(49, 'BRG002', 'Buku Pelajaran', 'Buku', 'Gudang B', '2025-01-01', 183),
(50, 'BRG003', 'Kaos', 'Pakaian', 'Gudang C', '2024-11-01', 138),
(51, 'BRG004', 'Kursi', 'Mebel', 'Gudang D', '2025-06-01', 93),
(52, 'BRG005', 'Mobil Mainan', 'Mainan', 'Gudang E', '2024-07-01', 246),
(53, 'BRG006', 'Tablet', 'Elektronik', 'Gudang A', '2025-02-01', 94),
(54, 'BRG007', 'Novel', 'Buku', 'Gudang B', '2024-09-01', 282),
(55, 'BRG008', 'Jaket', 'Pakaian', 'Gudang C', '2024-10-01', 180),
(56, 'BRG009', 'Meja', 'Mebel', 'Gudang D', '2025-05-01', 107),
(57, 'BRG010', 'Robot Mainan', 'Mainan', 'Gudang E', '2024-08-01', 220),
(58, 'BRG011', 'Handphone', 'Elektronik', 'Gudang C', '2027-06-17', 127);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `persediaan`
--
ALTER TABLE `persediaan`
  ADD PRIMARY KEY (`nomor`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `persediaan`
--
ALTER TABLE `persediaan`
  MODIFY `nomor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=60;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
