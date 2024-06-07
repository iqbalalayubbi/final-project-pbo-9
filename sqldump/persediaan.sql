-- phpMyAdmin SQL Dump
-- version 5.2.1-4.fc40
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Jun 07, 2024 at 06:07 AM
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
(1, 'BRG001', 'BERAS', 'MAKANAN', 'Gudang A', '2024-12-31', 100),
(2, 'BRG002', 'Minyak Goreng', 'Bahan Pokok', 'Gudang B', '2025-01-15', 150),
(3, 'BRG003', 'Gula Pasir', 'Bahan Pokok', 'Gudang C', '2024-11-10', 200),
(4, 'BRG004', 'Tepung Terigu', 'Bahan Pokok', 'Gudang D', '2024-10-05', 250),
(5, 'BRG005', 'Kopi Bubuk', 'Minuman', 'Gudang E', '2025-02-20', 300),
(6, 'asfawf', 'wfaefawef', 'wafwaf', 'wafawef', '2024-06-04', 12313);

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
  MODIFY `nomor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
