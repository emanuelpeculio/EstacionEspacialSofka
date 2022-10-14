-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 14-10-2022 a las 21:58:56
-- Versión del servidor: 10.4.14-MariaDB
-- Versión de PHP: 7.4.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `estacion_espacial_sofka`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `lanzadera`
--

CREATE TABLE `lanzadera` (
  `propulsion` varchar(255) DEFAULT NULL,
  `codigo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `lanzadera`
--

INSERT INTO `lanzadera` (`propulsion`, `codigo`) VALUES
('123123', 123128);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mision`
--

CREATE TABLE `mision` (
  `codigo` int(11) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `estado` varchar(255) DEFAULT NULL,
  `mision` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `nave_codigo` int(11) DEFAULT NULL,
  `planetadestino_codigo` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `nave`
--

CREATE TABLE `nave` (
  `codigo` int(11) NOT NULL,
  `activo` int(11) NOT NULL,
  `combustible` varchar(255) DEFAULT NULL,
  `estado` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `peso` double NOT NULL,
  `tipo` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `nave`
--

INSERT INTO `nave` (`codigo`, `activo`, `combustible`, `estado`, `nombre`, `peso`, `tipo`) VALUES
(123128, 1, 'Comb', 'En Base', 'Nave', 129391, 'Lanzadera');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `notripulado`
--

CREATE TABLE `notripulado` (
  `orbita` varchar(255) DEFAULT NULL,
  `codigo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `planetadestino`
--

CREATE TABLE `planetadestino` (
  `codigo` int(11) NOT NULL,
  `activo` int(11) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `tamanio` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tripulado`
--

CREATE TABLE `tripulado` (
  `cant_pasajeros` int(11) NOT NULL,
  `orbita` varchar(255) DEFAULT NULL,
  `codigo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `lanzadera`
--
ALTER TABLE `lanzadera`
  ADD PRIMARY KEY (`codigo`);

--
-- Indices de la tabla `mision`
--
ALTER TABLE `mision`
  ADD PRIMARY KEY (`codigo`),
  ADD KEY `FK_t07r7ft6vb2psfr6ykkmic9hv` (`nave_codigo`),
  ADD KEY `FK_8hm3decjsssii72ur91aqet1r` (`planetadestino_codigo`);

--
-- Indices de la tabla `nave`
--
ALTER TABLE `nave`
  ADD PRIMARY KEY (`codigo`);

--
-- Indices de la tabla `notripulado`
--
ALTER TABLE `notripulado`
  ADD PRIMARY KEY (`codigo`);

--
-- Indices de la tabla `planetadestino`
--
ALTER TABLE `planetadestino`
  ADD PRIMARY KEY (`codigo`);

--
-- Indices de la tabla `tripulado`
--
ALTER TABLE `tripulado`
  ADD PRIMARY KEY (`codigo`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `lanzadera`
--
ALTER TABLE `lanzadera`
  ADD CONSTRAINT `FK_oe55y3uq1ofarncdlrt8mki3j` FOREIGN KEY (`codigo`) REFERENCES `nave` (`codigo`);

--
-- Filtros para la tabla `mision`
--
ALTER TABLE `mision`
  ADD CONSTRAINT `FK_8hm3decjsssii72ur91aqet1r` FOREIGN KEY (`planetadestino_codigo`) REFERENCES `planetadestino` (`codigo`),
  ADD CONSTRAINT `FK_t07r7ft6vb2psfr6ykkmic9hv` FOREIGN KEY (`nave_codigo`) REFERENCES `nave` (`codigo`);

--
-- Filtros para la tabla `notripulado`
--
ALTER TABLE `notripulado`
  ADD CONSTRAINT `FK_4b8p3qyb5xiptx7f4nhfoxw9l` FOREIGN KEY (`codigo`) REFERENCES `nave` (`codigo`);

--
-- Filtros para la tabla `tripulado`
--
ALTER TABLE `tripulado`
  ADD CONSTRAINT `FK_j6wxf29ehy2823q6oxj0o3v8t` FOREIGN KEY (`codigo`) REFERENCES `nave` (`codigo`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
