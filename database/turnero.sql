-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 22-01-2024 a las 23:29:33
-- Versión del servidor: 10.4.27-MariaDB
-- Versión de PHP: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `turnero`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ciudadano`
--

CREATE TABLE `ciudadano` (
  `IDCIUDADANO` int(11) NOT NULL,
  `APELLIDOS` varchar(255) DEFAULT NULL,
  `NOMBRE` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

--
-- Volcado de datos para la tabla `ciudadano`
--

INSERT INTO `ciudadano` (`IDCIUDADANO`, `APELLIDOS`, `NOMBRE`) VALUES
(1, 'Martin', 'David'),
(2, 'Ro', 'Pedro'),
(3, 'Broward', 'Rodd'),
(5, 'Kojima', 'Hideo'),
(10, 'Barlog', 'Cory');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `turno`
--

CREATE TABLE `turno` (
  `IDTURNO` int(11) NOT NULL,
  `ATENDIDO` tinyint(1) DEFAULT 0,
  `ESPERA` tinyint(1) DEFAULT 0,
  `FECHA` date DEFAULT NULL,
  `ciudadano_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

--
-- Volcado de datos para la tabla `turno`
--

INSERT INTO `turno` (`IDTURNO`, `ATENDIDO`, `ESPERA`, `FECHA`, `ciudadano_id`) VALUES
(1, 0, 0, '2024-01-17', 1),
(2, 0, 0, '2024-02-10', 1),
(3, 0, 0, '2024-07-07', 2),
(4, 0, 0, '2024-02-08', 3),
(6, 0, 0, '2024-01-05', 1),
(8, 0, 1, '2024-01-28', 1),
(9, 0, 0, '2024-01-23', 1),
(10, 0, 1, '2024-01-22', 1),
(11, 0, 1, '2024-01-22', 1),
(12, 1, 1, '2024-01-22', 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `ciudadano`
--
ALTER TABLE `ciudadano`
  ADD PRIMARY KEY (`IDCIUDADANO`);

--
-- Indices de la tabla `turno`
--
ALTER TABLE `turno`
  ADD PRIMARY KEY (`IDTURNO`),
  ADD KEY `FK_TURNO_ciudadano_id` (`ciudadano_id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `ciudadano`
--
ALTER TABLE `ciudadano`
  MODIFY `IDCIUDADANO` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `turno`
--
ALTER TABLE `turno`
  MODIFY `IDTURNO` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `turno`
--
ALTER TABLE `turno`
  ADD CONSTRAINT `FK_TURNO_ciudadano_id` FOREIGN KEY (`ciudadano_id`) REFERENCES `ciudadano` (`IDCIUDADANO`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
