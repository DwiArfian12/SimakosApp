-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: May 31, 2023 at 11:01 AM
-- Server version: 8.0.30
-- PHP Version: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `simakos_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin_tbl`
--

CREATE TABLE `admin_tbl` (
  `id_admin` int NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `admin_tbl`
--

INSERT INTO `admin_tbl` (`id_admin`, `username`, `password`) VALUES
(1, 'admin', 'admin'),
(2, 'admin2', 'admin2');

-- --------------------------------------------------------

--
-- Table structure for table `kamar_tbl`
--

CREATE TABLE `kamar_tbl` (
  `id_kamar` int NOT NULL,
  `jenis` varchar(100) NOT NULL,
  `harga` bigint NOT NULL,
  `status` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `kamar_tbl`
--

INSERT INTO `kamar_tbl` (`id_kamar`, `jenis`, `harga`, `status`) VALUES
(1, 'Reguler', 500000, 'Tidak Tersedia'),
(2, 'Reguler', 500000, 'Tidak Tersedia'),
(3, 'Reguler', 500000, 'Tersedia'),
(4, 'Superior', 750000, 'Tidak Tersedia'),
(5, 'Superior', 750000, 'Tersedia'),
(6, 'Superior', 750000, 'Tersedia'),
(7, 'Eksklusif', 1000000, 'Tidak Tersedia'),
(8, 'Eksklusif', 1000000, 'Tersedia'),
(9, 'Eksklusif', 1000000, 'Tersedia');

-- --------------------------------------------------------

--
-- Table structure for table `penghuni_tbl`
--

CREATE TABLE `penghuni_tbl` (
  `id_penghuni` int NOT NULL,
  `nama` varchar(100) NOT NULL,
  `nik` varchar(20) NOT NULL,
  `no_kamar` int NOT NULL,
  `tgl_masuk` date DEFAULT NULL,
  `tgl_keluar` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `penghuni_tbl`
--

INSERT INTO `penghuni_tbl` (`id_penghuni`, `nama`, `nik`, `no_kamar`, `tgl_masuk`, `tgl_keluar`) VALUES
(1, 'Elsa Zahra Setiawati', ' 22520244026', 1, '2023-05-01', '2023-06-01'),
(2, 'Salsabila Miftahul Atha\r\n', '22520241008', 2, '2023-04-01', '2023-05-01'),
(3, 'Geloria Marsela Nanda', ' 22520249014 ', 4, '2023-03-01', '2023-05-01'),
(4, 'Berliana Putri Mufana', ' 22520244006', 7, '2023-05-01', '2023-06-01');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin_tbl`
--
ALTER TABLE `admin_tbl`
  ADD PRIMARY KEY (`id_admin`);

--
-- Indexes for table `kamar_tbl`
--
ALTER TABLE `kamar_tbl`
  ADD PRIMARY KEY (`id_kamar`);

--
-- Indexes for table `penghuni_tbl`
--
ALTER TABLE `penghuni_tbl`
  ADD PRIMARY KEY (`id_penghuni`),
  ADD KEY `no_kamar` (`no_kamar`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin_tbl`
--
ALTER TABLE `admin_tbl`
  MODIFY `id_admin` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `kamar_tbl`
--
ALTER TABLE `kamar_tbl`
  MODIFY `id_kamar` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `penghuni_tbl`
--
ALTER TABLE `penghuni_tbl`
  MODIFY `id_penghuni` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `penghuni_tbl`
--
ALTER TABLE `penghuni_tbl`
  ADD CONSTRAINT `penghuni_tbl_ibfk_1` FOREIGN KEY (`no_kamar`) REFERENCES `kamar_tbl` (`id_kamar`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
