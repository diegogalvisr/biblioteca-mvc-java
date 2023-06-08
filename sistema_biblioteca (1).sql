-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 08-06-2023 a las 05:36:12
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.1.17

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `sistema_biblioteca`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `admins`
--

CREATE TABLE `admins` (
  `id_admin` int(11) NOT NULL,
  `usuario` varchar(255) NOT NULL,
  `clave` varchar(255) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `apellido` varchar(255) NOT NULL,
  `direccion` varchar(255) NOT NULL,
  `cargo` int(11) NOT NULL,
  `imagen` longblob DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `admins`
--

INSERT INTO `admins` (`id_admin`, `usuario`, `clave`, `nombre`, `apellido`, `direccion`, `cargo`, `imagen`) VALUES
(1, 'diegosky7858', '1234', 'JUAN DIEGO', 'GALVIS ROMERO', 'CALLE 22A#21-19 AGUAS CALIENTES', 1, 0xffd8ffe1046b4578696600004d4d002a000000080007011200030000000100010000011a00050000000100000062011b0005000000010000006a012800030000000100020000013100020000001f000000720132000200000014000000918769000400000001000000a8000000d4002dc6c000002710002dc6c00000271041646f62652050686f746f73686f702032312e30202857696e646f77732900323032333a30353a31372031363a34363a3434000000000003a001000300000001ffff0000a00200040000000100000064a003000400000001000000640000000000000006010300030000000100060000011a00050000000100000122011b0005000000010000012a0128000300000001000200000201000400000001000001320202000400000001000003310000000000000048000000010000004800000001ffd8ffed000c41646f62655f434d0001ffee000e41646f626500648000000001ffdb0084000c08080809080c09090c110b0a0b11150f0c0c0f1518131315131318110c0c0c0c0c0c110c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c010d0b0b0d0e0d100e0e10140e0e0e14140e0e0e0e14110c0c0c0c0c11110c0c0c0c0c0c110c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0cffc00011080018001803012200021101031101ffdd00040002ffc4013f0000010501010101010100000000000000030001020405060708090a0b0100010501010101010100000000000000010002030405060708090a0b1000010401030204020507060805030c33010002110304211231054151611322718132061491a1b14223241552c16233347282d14307259253f0e1f163733516a2b283264493546445c2a3743617d255e265f2b384c3d375e3f3462794a485b495c4d4e4f4a5b5c5d5e5f55666768696a6b6c6d6e6f637475767778797a7b7c7d7e7f711000202010204040304050607070605350100021103213112044151617122130532819114a1b14223c152d1f0332462e1728292435315637334f1250616a2b283072635c2d2449354a317644555367465e2f2b384c3d375e3f34694a485b495c4d4e4f4a5b5c5d5e5f55666768696a6b6c6d6e6f62737475767778797a7b7c7ffda000c03010002110311003f00f48027812b94eb377586753231ecb41bdfe960d7558d2cacb0b6a9cbe9db5cccfab21e6cbf32edfeae2627f47f4eea565e47d60eb3f59f172b27a1bbecacc0b4d358aaf2d75a5c1af643ff0045eebbdcd6eef67e8ff4762e7fa2fd63ebd5f5dc37e3542f2d7b6ab30ab687135bcb6abec97b5bf64f6967e97f47b2cf4fed16d9fa44da492facfd9ea0ed068098f82488c731eddf59df59d4387824825fffd0b3f5768fac6dea99edb306ecac0c8758c2fbd8da2b0d64b319dfa618cdbbd7dbfa4fb3d5fe17f90b47f63f57aebbf2efb7a7fd5fa5e37646452d6bafda4cb9b6e5d75e1359bde7deff00b45fff006eaf104934ee97d928fad58d463d14636eea17615b66ccfc8adf457fa40edde9b37ffa27ff0087bb7ff397fa75a4bc6d24b446afffd9ffed0c7050686f746f73686f7020332e30003842494d0425000000000010000000000000000000000000000000003842494d043a0000000000ef000000100000000100000000000b7072696e744f7574707574000000050000000050737453626f6f6c0100000000496e7465656e756d00000000496e746500000000496d67200000000f7072696e745369787465656e426974626f6f6c000000000b7072696e7465724e616d65544558540000000100000000000f7072696e7450726f6f6653657475704f626a63000000110041006a0075007300740065002000640065002000700072007500650062006100000000000a70726f6f6653657475700000000100000000426c746e656e756d0000000c6275696c74696e50726f6f660000000970726f6f66434d594b003842494d043b00000000022d00000010000000010000000000127072696e744f75747075744f7074696f6e7300000017000000004370746e626f6f6c0000000000436c6272626f6f6c00000000005267734d626f6f6c000000000043726e43626f6f6c0000000000436e7443626f6f6c00000000004c626c73626f6f6c00000000004e677476626f6f6c0000000000456d6c44626f6f6c0000000000496e7472626f6f6c000000000042636b674f626a630000000100000000000052474243000000030000000052642020646f7562406fe000000000000000000047726e20646f7562406fe0000000000000000000426c2020646f7562406fe000000000000000000042726454556e744623526c74000000000000000000000000426c6420556e744623526c7400000000000000000000000052736c74556e74462350786c4072c000000000000000000a766563746f7244617461626f6f6c010000000050675073656e756d00000000506750730000000050675043000000004c656674556e744623526c74000000000000000000000000546f7020556e744623526c7400000000000000000000000053636c20556e74462350726340590000000000000000001063726f705768656e5072696e74696e67626f6f6c000000000e63726f7052656374426f74746f6d6c6f6e67000000000000000c63726f70526563744c6566746c6f6e67000000000000000d63726f705265637452696768746c6f6e67000000000000000b63726f7052656374546f706c6f6e6700000000003842494d03ed000000000010012c000000010001012c0000000100013842494d042600000000000e000000000000000000003f8000003842494d040d0000000000040000005a3842494d04190000000000040000001e3842494d03f3000000000009000000000000000001003842494d271000000000000a000100000000000000013842494d03f5000000000048002f66660001006c66660006000000000001002f6666000100a1999a0006000000000001003200000001005a00000006000000000001003500000001002d000000060000000000013842494d03f80000000000700000ffffffffffffffffffffffffffffffffffffffffffff03e800000000ffffffffffffffffffffffffffffffffffffffffffff03e800000000ffffffffffffffffffffffffffffffffffffffffffff03e800000000ffffffffffffffffffffffffffffffffffffffffffff03e800003842494d040000000000000200003842494d040200000000000200003842494d043000000000000101003842494d042d0000000000060001000000033842494d0408000000000010000000010000024000000240000000003842494d041e000000000004000000003842494d041a00000000034d00000006000000000000000000000064000000640000000c00530069006e0020007400ed00740075006c006f002d00330000000100000000000000000000000000000000000000010000000000000000000000640000006400000000000000000000000000000000010000000000000000000000000000000000000010000000010000000000006e756c6c0000000200000006626f756e64734f626a6300000001000000000000526374310000000400000000546f70206c6f6e6700000000000000004c6566746c6f6e67000000000000000042746f6d6c6f6e670000006400000000526768746c6f6e670000006400000006736c69636573566c4c73000000014f626a6300000001000000000005736c6963650000001200000007736c69636549446c6f6e67000000000000000767726f757049446c6f6e6700000000000000066f726967696e656e756d0000000c45536c6963654f726967696e0000000d6175746f47656e6572617465640000000054797065656e756d0000000a45536c6963655479706500000000496d672000000006626f756e64734f626a6300000001000000000000526374310000000400000000546f70206c6f6e6700000000000000004c6566746c6f6e67000000000000000042746f6d6c6f6e670000006400000000526768746c6f6e67000000640000000375726c54455854000000010000000000006e756c6c54455854000000010000000000004d7367655445585400000001000000000006616c74546167544558540000000100000000000e63656c6c54657874497348544d4c626f6f6c010000000863656c6c546578745445585400000001000000000009686f727a416c69676e656e756d0000000f45536c696365486f727a416c69676e0000000764656661756c740000000976657274416c69676e656e756d0000000f45536c69636556657274416c69676e0000000764656661756c740000000b6267436f6c6f7254797065656e756d0000001145536c6963654247436f6c6f7254797065000000004e6f6e6500000009746f704f75747365746c6f6e67000000000000000a6c6566744f75747365746c6f6e67000000000000000c626f74746f6d4f75747365746c6f6e67000000000000000b72696768744f75747365746c6f6e6700000000003842494d042800000000000c000000023ff00000000000003842494d0414000000000004000000033842494d040c00000000034d00000001000000180000001800000048000006c00000033100180001ffd8ffed000c41646f62655f434d0001ffee000e41646f626500648000000001ffdb0084000c08080809080c09090c110b0a0b11150f0c0c0f1518131315131318110c0c0c0c0c0c110c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c010d0b0b0d0e0d100e0e10140e0e0e14140e0e0e0e14110c0c0c0c0c11110c0c0c0c0c0c110c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0cffc00011080018001803012200021101031101ffdd00040002ffc4013f0000010501010101010100000000000000030001020405060708090a0b0100010501010101010100000000000000010002030405060708090a0b1000010401030204020507060805030c33010002110304211231054151611322718132061491a1b14223241552c16233347282d14307259253f0e1f163733516a2b283264493546445c2a3743617d255e265f2b384c3d375e3f3462794a485b495c4d4e4f4a5b5c5d5e5f55666768696a6b6c6d6e6f637475767778797a7b7c7d7e7f711000202010204040304050607070605350100021103213112044151617122130532819114a1b14223c152d1f0332462e1728292435315637334f1250616a2b283072635c2d2449354a317644555367465e2f2b384c3d375e3f34694a485b495c4d4e4f4a5b5c5d5e5f55666768696a6b6c6d6e6f62737475767778797a7b7c7ffda000c03010002110311003f00f48027812b94eb377586753231ecb41bdfe960d7558d2cacb0b6a9cbe9db5cccfab21e6cbf32edfeae2627f47f4eea565e47d60eb3f59f172b27a1bbecacc0b4d358aaf2d75a5c1af643ff0045eebbdcd6eef67e8ff4762e7fa2fd63ebd5f5dc37e3542f2d7b6ab30ab687135bcb6abec97b5bf64f6967e97f47b2cf4fed16d9fa44da492facfd9ea0ed068098f82488c731eddf59df59d4387824825fffd0b3f5768fac6dea99edb306ecac0c8758c2fbd8da2b0d64b319dfa618cdbbd7dbfa4fb3d5fe17f90b47f63f57aebbf2efb7a7fd5fa5e37646452d6bafda4cb9b6e5d75e1359bde7deff00b45fff006eaf104934ee97d928fad58d463d14636eea17615b66ccfc8adf457fa40edde9b37ffa27ff0087bb7ff397fa75a4bc6d24b446afffd9003842494d042100000000005700000001010000000f00410064006f00620065002000500068006f0074006f00730068006f00700000001400410064006f00620065002000500068006f0074006f00730068006f00700020003200300032003000000001003842494d04060000000000070004000000010100ffe10e7e687474703a2f2f6e732e61646f62652e636f6d2f7861702f312e302f003c3f787061636b657420626567696e3d22efbbbf222069643d2257354d304d7043656869487a7265537a4e54637a6b633964223f3e203c783a786d706d65746120786d6c6e733a783d2261646f62653a6e733a6d6574612f2220783a786d70746b3d2241646f626520584d5020436f726520352e362d633134382037392e3136343033362c20323031392f30382f31332d30313a30363a35372020202020202020223e203c7264663a52444620786d6c6e733a7264663d22687474703a2f2f7777772e77332e6f72672f313939392f30322f32322d7264662d73796e7461782d6e7323223e203c7264663a4465736372697074696f6e207264663a61626f75743d222220786d6c6e733a786d703d22687474703a2f2f6e732e61646f62652e636f6d2f7861702f312e302f2220786d6c6e733a786d704d4d3d22687474703a2f2f6e732e61646f62652e636f6d2f7861702f312e302f6d6d2f2220786d6c6e733a73744576743d22687474703a2f2f6e732e61646f62652e636f6d2f7861702f312e302f73547970652f5265736f757263654576656e74232220786d6c6e733a70686f746f73686f703d22687474703a2f2f6e732e61646f62652e636f6d2f70686f746f73686f702f312e302f2220786d6c6e733a64633d22687474703a2f2f7075726c2e6f72672f64632f656c656d656e74732f312e312f2220786d703a43726561746f72546f6f6c3d2241646f62652050686f746f73686f702032312e30202857696e646f7773292220786d703a437265617465446174653d22323032332d30352d31375431363a34363a34342d30353a30302220786d703a4d65746164617461446174653d22323032332d30352d31375431363a34363a34342d30353a30302220786d703a4d6f64696679446174653d22323032332d30352d31375431363a34363a34342d30353a30302220786d704d4d3a496e7374616e636549443d22786d702e6969643a65396463306261322d323036302d313834612d396464362d6532393462316237313666322220786d704d4d3a446f63756d656e7449443d2261646f62653a646f6369643a70686f746f73686f703a33313430373134312d306337642d396134342d623039362d3339356131386630633537352220786d704d4d3a4f726967696e616c446f63756d656e7449443d22786d702e6469643a31303236336539352d613435382d393234302d383764632d616433623432623031333539222070686f746f73686f703a436f6c6f724d6f64653d2233222070686f746f73686f703a49434350726f66696c653d2241646f62652052474220283139393829222064633a666f726d61743d22696d6167652f6a706567223e203c786d704d4d3a486973746f72793e203c7264663a5365713e203c7264663a6c692073744576743a616374696f6e3d2263726561746564222073744576743a696e7374616e636549443d22786d702e6969643a31303236336539352d613435382d393234302d383764632d616433623432623031333539222073744576743a7768656e3d22323032332d30352d31375431363a34363a34342d30353a3030222073744576743a736f6674776172654167656e743d2241646f62652050686f746f73686f702032312e30202857696e646f777329222f3e203c7264663a6c692073744576743a616374696f6e3d227361766564222073744576743a696e7374616e636549443d22786d702e6969643a65396463306261322d323036302d313834612d396464362d653239346231623731366632222073744576743a7768656e3d22323032332d30352d31375431363a34363a34342d30353a3030222073744576743a736f6674776172654167656e743d2241646f62652050686f746f73686f702032312e30202857696e646f777329222073744576743a6368616e6765643d222f222f3e203c2f7264663a5365713e203c2f786d704d4d3a486973746f72793e203c70686f746f73686f703a446f63756d656e74416e636573746f72733e203c7264663a4261673e203c7264663a6c693e36353242463834344137353235313837373736394345433442454535433235373c2f7264663a6c693e203c2f7264663a4261673e203c2f70686f746f73686f703a446f63756d656e74416e636573746f72733e203c2f7264663a4465736372697074696f6e3e203c2f7264663a5244463e203c2f783a786d706d6574613e2020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020203c3f787061636b657420656e643d2277223f3effe202404943435f50524f46494c450001010000023041444245021000006d6e74725247422058595a2007cf00060003000000000000616373704150504c000000006e6f6e65000000000000000000000000000000000000f6d6000100000000d32d4144424500000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000a63707274000000fc0000003264657363000001300000006b777470740000019c00000014626b7074000001b00000001472545243000001c40000000e67545243000001d40000000e62545243000001e40000000e7258595a000001f4000000146758595a00000208000000146258595a0000021c000000147465787400000000436f7079726967687420313939392041646f62652053797374656d7320496e636f72706f726174656400000064657363000000000000001141646f62652052474220283139393829000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000058595a20000000000000f35100010000000116cc58595a200000000000000000000000000000000063757276000000000000000102330000637572760000000000000001023300006375727600000000000000010233000058595a200000000000009c1800004fa5000004fc58595a20000000000000348d0000a02c00000f9558595a2000000000000026310000102f0000be9cffee000e41646f626500640000000001ffdb0084000604040405040605050609060506090b080606080b0c0a0a0b0a0a0c100c0c0c0c0c0c100c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c010707070d0c0d18101018140e0e0e14140e0e0e0e14110c0c0c0c0c11110c0c0c0c0c0c110c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0c0cffc00011080064006403011100021101031101ffdd0004000dffc401a20000000701010101010000000000000000040503020601000708090a0b0100020203010101010100000000000000010002030405060708090a0b1000020103030204020607030402060273010203110400052112314151061361227181143291a10715b14223c152d1e1331662f0247282f12543345392a2b26373c235442793a3b33617546474c3d2e2082683090a181984944546a4b456d355281af2e3f3c4d4e4f465758595a5b5c5d5e5f566768696a6b6c6d6e6f637475767778797a7b7c7d7e7f738485868788898a8b8c8d8e8f82939495969798999a9b9c9d9e9f92a3a4a5a6a7a8a9aaabacadaeafa110002020102030505040506040803036d0100021103042112314105511361220671819132a1b1f014c1d1e1234215526272f1332434438216925325a263b2c20773d235e2448317549308090a18192636451a2764745537f2a3b3c32829d3e3f38494a4b4c4d4e4f465758595a5b5c5d5e5f5465666768696a6b6c6d6e6f6475767778797a7b7c7d7e7f738485868788898a8b8c8d8e8f839495969798999a9b9c9d9e9f92a3a4a5a6a7a8a9aaabacadaeafaffda000c03010002110311003f00f47652cdc062aea6295acb5c50a0f1038aa0eeee74dd2ecee350d46ea2b1b1b65e771753b88e345f1666f1fd91fb5880ac166ff9c8cfca28ee8db45abb4e94f8aed217f4b91fd81cb8bb353fc8e392e128e20c8745f30f96fccb6cf79a05fa5e471ff7b18aacb1ff00af1b51b8ff0095f672245241b44d5f971a1ae042a240eee39fd9f0c52d4b6c827e6d41f08152698aaf40bd10163f70fbce2aade94fc6bc453c37fd78d2bfffd0f47652cdc314b78a1a2314ad2b5d86fe18a1f3cfe6fdfeaff987e705f2569509ff000ee8574aba84e36fad5f28a4bbff00be6d158a7fc65e6dfcb9314376077678fe46f27c3689631f976c16d628d50a3c084b0e34e4cc472ab75ae57659d07907e617e5d6abe529c79c3f2f6ea7d2e6d3eb35d69913b32a28fb52421b9064a7f7b0b725e3938caf62c487b6fe57f9b24f3979134cf32dcdbadb5ddd7a90dd471ed199addcc6f2475e91c94e617f63ece02299065907169d569b6ffab02552e2dd1e652c2a42edf7e285eb12af418aaa50530abfffd1f47652cdc314b78a1c4e294a7ccde605f2fe8efa9fa42664748d159b84619c9f8e47df8c68aacc7fe07141796693e49bb5d2f50babdbe2c2efd6b85b240c8b224a59c4970eb496473cbd5f417f768ffefdc7898d3cbf54b1f3a69fafc0d05bb582da1fdceb765712c96b711fec23ab7256f50d11633f1b3fecae59b163bb2f1f9aba7de5e3e83a8e9f71657b2472daced3a85f42f0c6ca2de71fb0d237c08df679643819713d5bf2cfca373e57f20687a0de53ebb67056ed577559a56323a8ff0054b53fd6c494865314604cbfe7db03255917f78bf238a1c17142ea6d8abfffd2f46d72964de297629762a83d66dd67d22e8342b3fa69ea244ff64bafd9ae2ac5818a38979b56408391049f88015a13bede391430fd6aecd85e41a9e96b61a8b4138964b19a472f1303f14b1450d79dcd3ec348bfbb6f8b2410529f2ef919b55f396a3e6a8ad9edef3530f3bdb4d10bb8049227046789995165858f20656f47f6ff00c9c903d114f6db0b492d34fb5b492e24bb92da18e192ee63ca4959142991ced56622b8128841fbc5f9e0554907ef13e9c52ea62aea6d8a1fffd3f46f7ca593606f4e9e24ec29e271561171f9b5a25a5dca97fa5ea367a7a398e1d5668e2114bc4d39fa61ccf144c7fbb9258d79fdac34b6a77ff9c1e5eb464ff469658491eb5c2c88122522bcdb62fc4557f67ecb72c578987f98bcc2de66f33795752919a2d3acaedae20b757a2193d3610b3d3ed95914ff00adfeae3deb6a2fe6982c75496cb5398c56770c5adaebb2b37546af41dd3008d845a4ba9f95d355d615f4d16f702735fae59a98af11da803c6c84162dfb4bf1ab7f2e112a410f74f2f68f269ba7225c0ff4d9554dc9f020502ffcd5fe560669a53155a3fbc1f3c50bdfeda62ad9c52eed8a1fffd4f4700cc68a093e032964c7bcff007f71a779798af388dcc8b0b4801042d0b3015a7da0298abc2b5bd46df508e5b48d92fda844d632b186e287bc3c82b07fe5575e3ff166480a624b05b3d5a508fa74cfeac96a49b39254a3b43bd51bc194ed227faeb965314d74af30a5ce87185664974d7faa32a9af04079c1bf51507e13fe46448dd2d6b7af35cdb882f141908dcb0f81c0eea7a50ff00c2e10104b13d3b55d42e65d65742924b5b3d3ecda58e78a56597d78583b3a356b5ecbc3ecaae12af7afc86fcd6d475a920d03cc37a6e6f2ead22b9d3ee263595a6e359622dfb4aca39a57f6be1c84a34cc17b6919064b3fdd83155cff697e78ab67ae2aec287ffd51de74f3d79924f306a96dfa5ae12c2daee58e0b68dfd34091bd00f838b1e9dce400412f36fcb8d6afa6bcf30ddea17f24962aaa22b09e49ae2379a7b9255228aacdea7043c0a7c5ff0d86412193de450ddaf19f46ba789778926b98126858efca32e7d689bfc8e781581f9e2e2decaf6dae60327af6c40bbf5d0c733ad418dd854a37ed45ea27dbfdac9862526bab8d6349d56ea7d2ae1adda58a9271a32c96f2518555832b713b8fe5c356a10ccfe669cbcb3de1bb8668f9307a70e04d3d48d071e2cadb370f897fca5c692d269566b24cb0075b7b568fd177aa3991cf063c4745e21ab5fb58a11de55d6aeed75fd2ee2c5cc77b682110301c80f4ea7651f68901471c055f6e7953cc09e61f2ed96b0a8237b852b3c4183849a33c641c86dd472ff0027ece545b0724cdbed0f9e04ae7eabf3c55b3d7156abb6297fffd6e5be66f3699355d4250f412dd5cb03f395c8fc3080c515f94569adda79c346d2ae97ead6be66ba8d26ba8e489e636912199a389d19de0f5abc256a2bfa7f07f36424c83eb210a58e9de9e8fa55b4cd19023b1f8215653f6bf78c1be2ff005fed6576cd8479bfc9fa479e34cfd1be67d0356b0b8858fd43508218ae248588a0226876922f189ffe11be2c20a0bc0350d16ff4db892c350879eade5d90dadedbd29f58b57dd5d3fd643cd3fe072d06daca4b3c4b61786cd98be9f3372b49cec51a4dd4effb2fb06ff2b0aafd62f960bf9e09551a708f717324679707e276f86a09a0c36a9af943f2b35993ce6fa2f98cb688628e3b811d39cb710ca018dadc8a2488dd19f97146f81fe2f87204d269f4fe8061f28d9c1a75a2b9d2d39bbc0c4cb234a6838c5c57e1a9ebfb3955b63361224b1a4b19e48e030237ebdbe63a1c50bdcf4f9e292b9bae2ad76c287fffd7217ff9c66fcd1b496f24b7bcd26ee1b8825b7918cc633e9c85493fbe8d84668bf6d7e35c8f105a40f96bf2735df25f9b74df326a1ae6836b169772b73f528ef3eb177246a483122246bce464247ecafed624dec97d100c77f6925ac92cb147301c66b7731cabdc323aeea7df2a64c6b5ff002fa69c8ed6f3f9a270ca1c4fa6dea4ad55ea8e930ad4f62a30828a601e6df2cdd79ab42b4d5fc9f69abc9e64d38adb9bad52116b2dd5b331e70b349e9876b7279abb2ff32ae481a2822d855cfe53fe74ddc0b0c9a146845434c6e600c54ef43f164f8c238533f28ffce3979cdafe1b8f303d9d8580951eead965f5a69215605e253182885d471e4cdfb591391785f416a96fa6dceb4bae5fba9b8b68841631b15f4ad507dbf44101b94b45f52a7f613204db2a4bb5bd7342b6b637373a8c56f1d2818b00cc4f40807c4edfcaa9f1604db25f254e26f2e4242985559bd3b5614686326a8adb93c987c67fd6c285de73f35c1e55d19b58bab296eec637549da074568cb9a2121e838b1db957ed6102d4ec85f21fe63796fcf3637777a37ad1b584ab0dedadcaaac91b3af243552c8e8e3a30384c6941b64fc972297fffd088ead71e7c1e51d075ef30f9af50d4a0f3289de3d2e695bd38e28492aec037c45a9fcbfb5911cd64c37cad49b5896654124890ca22590ffbb260510927f96a4e4cb17d0df95fe61fade8d0d9cd37ad7160042663feec55a857fc38e533145b225e88b3c4c9bb00c3b1c82527d4f559e1626b534ea4f6c55219fcd93a1f88d29dbc7db0a2d44f9aeee447a305e2a4963d00f1a9f0c696de79e61f385c6bac6c74cb974b304acfa927db908ea96e4ecabfcf3d3fc98ff9b2c10add899296973e97a6491fd5ada159529fe93229966e47b8790b15ff00638916805eb9f963ae35dea735b23fa90bdbb3bd3b3230a1fc7214cc167fa8da6997f672596a56c975633d167b6b840f13d18328653b1f894362aad1416d044ab0c705bc35e216311c495f0a2f115c36abb9435e3eac5cab4e3ea256be14af5c52ff00ffd18efe7146747d0fc8da4c8c07d4b40e4e09a00ce52a4feac8c3aac981f9774f96dac6deee5574babf98c76d6c41573122579f1fb7f1b31e3fe4e4d8b2bd2bcde9e54f376916b7ec2dad6587d2d40d7fb9170d58a46a7fbe9c2f21fcacd9090b090f70bcd627820f58c60f15a935054ff94a46cca7f64e54d96f3ff30fe635adaca56fee12d94ee3d460b5ff00541dce4c41819319b4f38ea3ad5d71d134cbed58b0aa8b781fd32474fde385503fcac34109da7e547e6ef9b28bab4b17977497a1fd1f1d25761ff1735473ff0057ecff009382c0e49a2cbf47ff009c766b655179e67bc70053d3b6b7b78969e1c9831fc31e329e14e3fe85efc8d2d0dddcead72dd4d6fda31ff031a2e3c45784275a6e83f979f96903dc454d3dafe910f56696e6e6e0835558d6466622bf698054fe76c7729d825bae7e6be892452dbc113b5374f53f77112bf1729260418956956dbece0a28b79d6a5a9dede8fafdd248f69752f18d22a037931f8847121a3c76cabf1c9338f5197e2e5c38ab1421fd5d2bebdf56fac9fd39ea7fbd7e849f52fac70e5fa3eb5fb7e87c5e97dbff009ed86d5fffd228fce3d5427e6a471abc29369fa75b0b1facc62680cb2729383a1fe656f85bf61b230e4b2e6c7ec74dfcecf324edfa134c9a56b862a751faaac3128e9b5d49c55569df25410c8342ff009c4af386a327d67cd7af5b587aadca686d835edc32f7ab9e11063feb3e44c934f62d0ff253cb7a3e851e8a9ab6b1756b19f81a5bb50541fd94511f18d3fc91902595261a57e53fe5c699706ee1d0e0b9bd26ad7b7dcaee72477e7316a7fb155c6d69964691a2048d55117a2200147d0302bb82d6bd0e2ae2945690b058d14b48ec4055502a5998d02818abcabce3f9e369034da7f93638f54ba8fe1b8d7660ff00a36d89216bc954fac413f6cf183fd6c988b13278bdcf9c350b99afefa0d6b4cbed74d4cfad6a723c5771f0a178ed654736b2c247c2b1aaa27fc57cb2548464be71fcccd734ab3862d134e7d0d1564586ded488e772dca3768d5eac894e744f859ffbce791e100ad9a4df51b8f3069f73a69bd8aca3f36dfab5adaa7d4d3d38e007d4964fdfb2d638bedbff00bb1bece3b2774d3f45d97e81ff0009ff0088e4fab7a5f5afefed2bf5cf5bd5f539d3fbef5b7f53d4f578ff009182d5ffd3ecd0ff00caafff00173ffc72bfc63e945cbeb3e9fd7bd2e3fbaa7adfe474f4fe2e3958ba64ca64f57e1e75e3fb35e94ff2722aa7f176ad3df1571a62ab4f1aed8ab5f0ff00b78ab638ed4e54f6fedc55e05f9f7ff2b2feb89f5eaff833d64f47ea1fef25790e3f5fe5f156bf6bd6fdc71cb614c656f38ff70df5ab3f4ff46fd63d0b9fadfd9faa70ab73fd25e9edebff00cb0f0fddfa7e9fed6250a569ff002adbf4e5efadfa0ff447d422a70faf7d5bd4a0f57d2ff777d7a9f6b97ee7fdf78eeaf40b9fab7e83bde5fa27fc1fea5afe8aa7d769e8d57d3f4fd3fdf7dbff007e7c5e9643af9a589797ff00c3ff00e27d73fe51ee3ea43f52fd23c7ea7e8d3e1fa8fe94f8f8fa9cbeb7cbf79cff00c8c96e849bf7bff2b73fe99ffadf2ffb56fe85fab7a5ff00489ebfa5ff00253fcbc3d15fffd9),
(2, 'alfredo59847/*784', 'alfredo12345', 'CARLOS', 'GALVIS', 'CLL 15 #9-58', 0, NULL),
(10, 'jgalvis romero96', 'diegofcb10', 'JUAN DIEGO', 'GALVIS ROMERO', 'CALLE 22A#21A-19', 1, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `autor`
--

CREATE TABLE `autor` (
  `id_autor` int(11) NOT NULL,
  `nombre` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `autor`
--

INSERT INTO `autor` (`id_autor`, `nombre`) VALUES
(1, 'AUTOR 1'),
(2, 'AUTOR 2'),
(3, 'AUTOR 3'),
(4, 'AUTOR 4'),
(5, 'AUTOR 5'),
(6, 'AUTOR 6'),
(7, 'AUTOR 7'),
(8, 'AUTOR 8'),
(9, 'AUTOR 9'),
(10, 'AUTOR 10');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `editorial`
--

CREATE TABLE `editorial` (
  `id_editorial` int(11) NOT NULL,
  `nombre` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `editorial`
--

INSERT INTO `editorial` (`id_editorial`, `nombre`) VALUES
(1, 'EDITORIAL 1'),
(2, 'EDITORIAL 2'),
(3, 'EDITORIAL 3'),
(4, 'EDITORIAL 4'),
(5, 'EDITORIAL 5'),
(6, 'EDITORIAL 6'),
(7, 'EDITORIAL 7'),
(8, 'EDITORIAL 8'),
(9, 'EDITORIAL 9'),
(10, 'EDITORIAL 10');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `libros`
--

CREATE TABLE `libros` (
  `id_libro` int(20) NOT NULL,
  `isbn` int(100) NOT NULL,
  `titulo` varchar(255) NOT NULL,
  `id_editorial` int(10) NOT NULL,
  `id_autor` int(10) NOT NULL,
  `tipo_libro` char(10) NOT NULL,
  `precio` int(10) NOT NULL,
  `contMaterial` varchar(100) NOT NULL,
  `categoria` varchar(100) NOT NULL,
  `cantidad` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `libros`
--

INSERT INTO `libros` (`id_libro`, `isbn`, `titulo`, `id_editorial`, `id_autor`, `tipo_libro`, `precio`, `contMaterial`, `categoria`, `cantidad`) VALUES
(1, 2023, 'Título 3', 5, 3, 'C', 45555, 'MATERIALES UTENCILIOS', 'ACCION', 12),
(5, 2147483647, 'Título 3', 4, 4, 'C', 52000, 'MATERIALES UTENCILIOS', 'ACCION', 12),
(9, 2147483647, 'Título 3', 4, 4, 'C', 38000, 'MATERIALES UTENCILIOS', 'ACCION', 12),
(13, 2147483647, 'Título 3', 4, 4, 'C', 38000, 'MATERIALES UTENCILIOS', 'ACCION', 12),
(16, 2147483647, 'Título 3', 4, 4, 'C', 38000, 'MATERIALES UTENCILIOS', 'ACCION', 12),
(17, 2147483647, 'Título 3', 4, 4, 'C', 38000, 'MATERIALES UTENCILIOS', 'ACCION', 12),
(18, 2147483647, 'Título 3', 4, 4, 'C', 38000, 'MATERIALES UTENCILIOS', 'ACCION', 12),
(19, 2147483647, 'Título 3', 4, 4, 'C', 38000, 'MATERIALES UTENCILIOS', 'ACCION', 12),
(20, 2147483647, 'Título 3', 4, 4, 'C', 38000, 'MATERIALES UTENCILIOS', 'ACCION', 12),
(21, 2147483647, 'Título 3', 4, 4, 'C', 38000, 'MATERIALES UTENCILIOS', 'ACCION', 12),
(22, 2147483647, 'Título 3', 4, 4, 'C', 38000, 'MATERIALES UTENCILIOS', 'ACCION', 12),
(23, 2147483647, 'Título 3', 4, 4, 'C', 38000, 'MATERIALES UTENCILIOS', 'ACCION', 12),
(24, 2147483647, 'Título 3', 4, 4, 'C', 38000, 'MATERIALES UTENCILIOS', 'ACCION', 12),
(25, 2147483647, 'Título 3', 4, 4, 'C', 38000, 'MATERIALES UTENCILIOS', 'ACCION', 12),
(26, 2147483647, 'Título 3', 4, 4, 'C', 38000, 'MATERIALES UTENCILIOS', 'ACCION', 12),
(27, 2147483647, 'Título 3', 4, 4, 'C', 38000, 'MATERIALES UTENCILIOS', 'ACCION', 12),
(28, 2147483647, 'Título 3', 4, 4, 'C', 38000, 'MATERIALES UTENCILIOS', 'ACCION', 12),
(29, 2147483647, 'Título 3', 4, 4, 'C', 38000, 'MATERIALES UTENCILIOS', 'ACCION', 12),
(30, 2147483647, 'Título 3', 4, 4, 'C', 38000, 'MATERIALES UTENCILIOS', 'ACCION', 12),
(31, 2147483647, 'Título 3', 4, 4, 'C', 38000, 'MATERIALES UTENCILIOS', 'ACCION', 12),
(32, 2147483647, 'Título 3', 4, 4, 'C', 38000, 'MATERIALES UTENCILIOS', 'ACCION', 12),
(33, 2147483647, 'Título 3', 4, 4, 'C', 38000, 'MATERIALES UTENCILIOS', 'ACCION', 12),
(34, 2147483647, 'Título 3', 4, 4, 'C', 38000, 'MATERIALES UTENCILIOS', 'ACCION', 12),
(35, 2147483647, 'Título 3', 4, 4, 'C', 38000, 'MATERIALES UTENCILIOS', 'ACCION', 12),
(36, 2147483647, 'Título 3', 4, 4, 'C', 38000, 'MATERIALES UTENCILIOS', 'ACCION', 12),
(37, 2147483647, 'Título 3', 4, 4, 'C', 38000, 'MATERIALES UTENCILIOS', 'ACCION', 12),
(38, 2147483647, 'Título 3', 4, 4, 'C', 38000, 'MATERIALES UTENCILIOS', 'ACCION', 12),
(39, 2147483647, 'Título 3', 4, 4, 'C', 38000, 'MATERIALES UTENCILIOS', 'ACCION', 12),
(40, 2147483647, 'Título 3', 4, 4, 'C', 38000, 'MATERIALES UTENCILIOS', 'ACCION', 12),
(41, 2147483647, 'Título 3', 4, 4, 'C', 38000, 'MATERIALES UTENCILIOS', 'ACCION', 12),
(42, 2147483647, 'Título 3', 4, 4, 'C', 38000, 'MATERIALES UTENCILIOS', 'ACCION', 12),
(43, 2147483647, 'Título 3', 4, 4, 'C', 38000, 'MATERIALES UTENCILIOS', 'ACCION', 12),
(44, 2147483647, 'Título 3', 4, 4, 'C', 38000, 'MATERIALES UTENCILIOS', 'ACCION', 12),
(45, 2147483647, 'Título 3', 4, 4, 'C', 38000, 'MATERIALES UTENCILIOS', 'ACCION', 12),
(46, 2147483647, 'Título 3', 4, 4, 'C', 38000, 'MATERIALES UTENCILIOS', 'ACCION', 12),
(47, 2147483647, 'Título 3', 4, 4, 'C', 38000, 'MATERIALES UTENCILIOS', 'ACCION', 12),
(48, 2147483647, 'Título 3', 4, 4, 'C', 38000, 'MATERIALES UTENCILIOS', 'ACCION', 12),
(50, 2147483647, 'Título 3', 4, 4, 'C', 38000, 'MATERIALES UTENCILIOS', 'ACCION', 12),
(51, 2147483647, 'Título 3', 4, 4, 'C', 38000, 'MATERIALES UTENCILIOS', 'ACCION', 12),
(52, 2147483647, 'Título 3', 4, 4, 'C', 38000, 'MATERIALES UTENCILIOS', 'ACCION', 12);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `multas`
--

CREATE TABLE `multas` (
  `id_multa` int(11) NOT NULL,
  `estado` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `multas`
--

INSERT INTO `multas` (`id_multa`, `estado`) VALUES
(1, 'ACTIVA'),
(2, 'DESACTIVA');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `prestamos`
--

CREATE TABLE `prestamos` (
  `id_prestamo` int(11) NOT NULL,
  `tipo_prestamo` char(2) NOT NULL,
  `id_admin` int(10) NOT NULL,
  `id_usuario` int(10) NOT NULL,
  `id_libro` int(10) NOT NULL,
  `asignatura` varchar(100) NOT NULL,
  `fecha_inicial` date NOT NULL,
  `fecha_final` date NOT NULL,
  `estado` char(2) NOT NULL,
  `acta` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `prestamos`
--

INSERT INTO `prestamos` (`id_prestamo`, `tipo_prestamo`, `id_admin`, `id_usuario`, `id_libro`, `asignatura`, `fecha_inicial`, `fecha_final`, `estado`, `acta`) VALUES
(2, 'C', 2, 3, 1, 'BIOLOGIA', '2023-05-19', '2023-05-26', 'E', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id_usuario` int(11) NOT NULL,
  `user_generico` varchar(100) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `apellido` varchar(255) NOT NULL,
  `direccion` varchar(255) NOT NULL,
  `telefono` varchar(255) NOT NULL,
  `telefonoF` varchar(255) NOT NULL,
  `grado` int(10) NOT NULL,
  `id_multa` varchar(100) NOT NULL DEFAULT 'DESACTIVA'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id_usuario`, `user_generico`, `nombre`, `apellido`, `direccion`, `telefono`, `telefonoF`, `grado`, `id_multa`) VALUES
(2, '20230682', 'DSAFASF', 'DASFASD', 'FADSFASSA', '3143480005', '3204872818', 601, '1'),
(3, '20231848', 'JUAN DIEGO', 'GALVIS ROMERO', 'CLL 9 #21-48', '3143480005', '3204872818', 603, '2');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `admins`
--
ALTER TABLE `admins`
  ADD PRIMARY KEY (`id_admin`);

--
-- Indices de la tabla `autor`
--
ALTER TABLE `autor`
  ADD PRIMARY KEY (`id_autor`);

--
-- Indices de la tabla `editorial`
--
ALTER TABLE `editorial`
  ADD PRIMARY KEY (`id_editorial`);

--
-- Indices de la tabla `libros`
--
ALTER TABLE `libros`
  ADD PRIMARY KEY (`id_libro`),
  ADD KEY `id_autor` (`id_autor`),
  ADD KEY `libros_ibfk_2` (`id_editorial`);

--
-- Indices de la tabla `multas`
--
ALTER TABLE `multas`
  ADD PRIMARY KEY (`id_multa`);

--
-- Indices de la tabla `prestamos`
--
ALTER TABLE `prestamos`
  ADD PRIMARY KEY (`id_prestamo`),
  ADD KEY `id_admin` (`id_admin`),
  ADD KEY `id_usuario` (`id_usuario`),
  ADD KEY `id_libro` (`id_libro`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id_usuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `admins`
--
ALTER TABLE `admins`
  MODIFY `id_admin` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `autor`
--
ALTER TABLE `autor`
  MODIFY `id_autor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `editorial`
--
ALTER TABLE `editorial`
  MODIFY `id_editorial` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `libros`
--
ALTER TABLE `libros`
  MODIFY `id_libro` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=53;

--
-- AUTO_INCREMENT de la tabla `multas`
--
ALTER TABLE `multas`
  MODIFY `id_multa` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `prestamos`
--
ALTER TABLE `prestamos`
  MODIFY `id_prestamo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id_usuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `libros`
--
ALTER TABLE `libros`
  ADD CONSTRAINT `libros_ibfk_1` FOREIGN KEY (`id_autor`) REFERENCES `autor` (`id_autor`),
  ADD CONSTRAINT `libros_ibfk_2` FOREIGN KEY (`id_editorial`) REFERENCES `editorial` (`id_editorial`);

--
-- Filtros para la tabla `prestamos`
--
ALTER TABLE `prestamos`
  ADD CONSTRAINT `prestamos_ibfk_1` FOREIGN KEY (`id_admin`) REFERENCES `admins` (`id_admin`),
  ADD CONSTRAINT `prestamos_ibfk_2` FOREIGN KEY (`id_usuario`) REFERENCES `usuarios` (`id_usuario`),
  ADD CONSTRAINT `prestamos_ibfk_3` FOREIGN KEY (`id_libro`) REFERENCES `libros` (`id_libro`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
