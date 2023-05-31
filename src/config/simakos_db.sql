-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: May 30, 2023 at 04:54 PM
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
  `id` int NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `admin_tbl`
--

INSERT INTO `admin_tbl` (`id`, `username`, `password`) VALUES
(1, 'admin', 'admin'),
(2, 'admin2', 'admin2');

-- --------------------------------------------------------

--
-- Table structure for table `kos_tbl`
--

CREATE TABLE `kos_tbl` (
  `id` int NOT NULL,
  `no_kamar` int NOT NULL,
  `jenis` varchar(100) NOT NULL,
  `harga` bigint NOT NULL,
  `status` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `kos_tbl`
--

INSERT INTO `kos_tbl` (`id`, `no_kamar`, `jenis`, `harga`, `status`) VALUES
(1, 1, 'Reguler', 500000, 'Tidak Tersedia'),
(2, 2, 'Reguler', 500000, 'Tidak Tersedia'),
(3, 3, 'Reguler', 500000, 'Tersedia'),
(4, 4, 'Superior', 750000, 'Tidak Tersedia'),
(5, 5, 'Superior', 750000, 'Tersedia'),
(6, 6, 'Superior', 750000, 'Tersedia'),
(7, 7, 'Eksklusif', 1000000, 'Tidak Tersedia'),
(8, 8, 'Eksklusif', 1000000, 'Tersedia'),
(9, 9, 'Eksklusif', 1000000, 'Tersedia');

-- --------------------------------------------------------

--
-- Table structure for table `tamu_tbl`
--

CREATE TABLE `tamu_tbl` (
  `id` int NOT NULL,
  `nama` varchar(100) NOT NULL,
  `nik` varchar(20) NOT NULL,
  `no_kamar` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `tamu_tbl`
--

INSERT INTO `tamu_tbl` (`id`, `nama`, `nik`, `no_kamar`) VALUES
(1, 'Elsa Zahra Setiawati', ' 22520244026', 1),
(2, 'Salsabila Miftahul Atha\r\n', '22520241008', 2),
(3, 'Geloria Marsela Nanda', ' 22520249014 ', 4),
(4, 'Berliana Putri Mufana', ' 22520244006', 7);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin_tbl`
--
ALTER TABLE `admin_tbl`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `kos_tbl`
--
ALTER TABLE `kos_tbl`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tamu_tbl`
--
ALTER TABLE `tamu_tbl`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin_tbl`
--
ALTER TABLE `admin_tbl`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `kos_tbl`
--
ALTER TABLE `kos_tbl`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `tamu_tbl`
--
ALTER TABLE `tamu_tbl`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
