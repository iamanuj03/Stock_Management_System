-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 13, 2020 at 08:17 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `stockmgtmentdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `tblclients`
--

CREATE TABLE `tblclients` (
  `clientID` varchar(255) NOT NULL,
  `clientName` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tblclients`
--

INSERT INTO `tblclients` (`clientID`, `clientName`) VALUES
('c01', 'Girish Emerith'),
('c02', 'Azhar Bhuheekhan'),
('c03', 'Boman Irani'),
('c04', 'client1');

-- --------------------------------------------------------

--
-- Table structure for table `tblorders`
--

CREATE TABLE `tblorders` (
  `orderID` varchar(255) NOT NULL,
  `clientID` varchar(255) NOT NULL,
  `ordersList` text NOT NULL,
  `Date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tblorders`
--

INSERT INTO `tblorders` (`orderID`, `clientID`, `ordersList`, `Date`) VALUES
('ord01', 'c02', 'Biscuit Marie-2Thon-3Delo Vital-2', '2020-03-13'),
('ord02', 'c01', 'Nuggets-null Matinée-10 ', '2020-10-13');

-- --------------------------------------------------------

--
-- Table structure for table `tblproducts`
--

CREATE TABLE `tblproducts` (
  `pdtID` varchar(255) NOT NULL,
  `pdtName` varchar(255) NOT NULL,
  `pdtRefNum` varchar(255) NOT NULL,
  `pdtUnitPrice` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tblproducts`
--

INSERT INTO `tblproducts` (`pdtID`, `pdtName`, `pdtRefNum`, `pdtUnitPrice`) VALUES
('p01', 'Biscuit Marie', 'marie001', 13.55),
('p02', 'Champagne Chamdor', 'chamdore002', 200.55),
('p03', 'Thon', 'thon003', 60.56),
('p04', 'Fish Fingers', 'fish004', 50.55),
('p05', 'Nuggets', 'nug005', 45.4),
('p06', 'Delo Vital', 'vital006', 30),
('p07', 'Biscuit Lu', 'lu007', 25.26),
('p08', 'Lays 25g', 'lays001', 15),
('p09', 'lays 50g', 'lays002', 30),
('p10', 'Matinée', 'mat010', 125);

-- --------------------------------------------------------

--
-- Table structure for table `tblstock`
--

CREATE TABLE `tblstock` (
  `pdtID` varchar(255) NOT NULL,
  `Quantity` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tblstock`
--

INSERT INTO `tblstock` (`pdtID`, `Quantity`) VALUES
('p01', 5),
('p02', 5),
('p03', 5),
('p04', 5),
('p05', 5),
('p06', 5),
('p07', 5),
('p08', 5),
('p09', 5),
('p10', 5);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tblclients`
--
ALTER TABLE `tblclients`
  ADD PRIMARY KEY (`clientID`);

--
-- Indexes for table `tblorders`
--
ALTER TABLE `tblorders`
  ADD PRIMARY KEY (`orderID`);

--
-- Indexes for table `tblproducts`
--
ALTER TABLE `tblproducts`
  ADD PRIMARY KEY (`pdtID`);

--
-- Indexes for table `tblstock`
--
ALTER TABLE `tblstock`
  ADD PRIMARY KEY (`pdtID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
