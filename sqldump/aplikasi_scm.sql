-- phpMyAdmin SQL Dump
-- version 5.2.1-4.fc40
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Jun 27, 2024 at 06:42 AM
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
-- Table structure for table `data_user`
--

CREATE TABLE `data_user` (
  `username` text NOT NULL,
  `password` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_general_ci;

--
-- Dumping data for table `data_user`
--

INSERT INTO `data_user` (`username`, `password`) VALUES
('testuser', 'testpassword'),
('admin', 'admin');

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
(18, 'ORD001', 'Dewi', 'Gunpla', 15000.00, 'Cepat', '2024-06-12'),
(19, 'ORD002', 'Wawan', 'Kursi', 20000.00, 'Cepat', '2024-06-13'),
(20, 'ORD003', 'Diana', 'Robot Mainan', 25000.00, 'Reguler', '2024-06-14'),
(24, 'ORD004', 'Ahmad', 'Buku Pelajaran', 12000.00, 'Same Day', '2024-06-12'),
(30, 'ORD005', 'Saiful', 'Kursi', 12000.00, 'Cepat', '2024-06-11');

-- --------------------------------------------------------

--
-- Table structure for table `permintaan`
--

CREATE TABLE `permintaan` (
  `nomor` int(11) NOT NULL,
  `kode_pemesanan` varchar(50) NOT NULL,
  `tanggal_pemesanan` date NOT NULL,
  `jenis_produk` varchar(50) NOT NULL,
  `pelanggan` varchar(100) NOT NULL,
  `jumlah_pesanan` int(11) NOT NULL,
  `status_pemesanan` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_general_ci;

--
-- Dumping data for table `permintaan`
--

INSERT INTO `permintaan` (`nomor`, `kode_pemesanan`, `tanggal_pemesanan`, `jenis_produk`, `pelanggan`, `jumlah_pesanan`, `status_pemesanan`) VALUES
(20, 'ORD001', '2024-06-11', 'Gunpla', 'Dewi', 2, 'Diajukan'),
(21, 'ORD002', '2024-06-12', 'Kursi', 'Wawan', 7, 'Diajukan'),
(22, 'ORD003', '2024-06-13', 'Robot Mainan', 'Diana', 4, 'Diajukan'),
(26, 'ORD004', '2024-06-12', 'Buku Pelajaran', 'Ahmad', 17, 'Diajukan'),
(32, 'ORD005', '2024-06-11', 'Kursi', 'Saiful', 12, 'Diajukan');

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
-- Indexes for table `pengiriman`
--
ALTER TABLE `pengiriman`
  ADD PRIMARY KEY (`nomor`);

--
-- Indexes for table `permintaan`
--
ALTER TABLE `permintaan`
  ADD PRIMARY KEY (`nomor`);

--
-- Indexes for table `persediaan`
--
ALTER TABLE `persediaan`
  ADD PRIMARY KEY (`nomor`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `pengiriman`
--
ALTER TABLE `pengiriman`
  MODIFY `nomor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;

--
-- AUTO_INCREMENT for table `permintaan`
--
ALTER TABLE `permintaan`
  MODIFY `nomor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33;

--
-- AUTO_INCREMENT for table `persediaan`
--
ALTER TABLE `persediaan`
  MODIFY `nomor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=60;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
