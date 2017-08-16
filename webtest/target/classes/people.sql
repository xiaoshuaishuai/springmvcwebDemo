CREATE TABLE `people` (
  `id` int(255) NOT NULL,
  `namep` varchar(255) DEFAULT NULL,
  `decp` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `posp`.`people` (`id`, `namep`, `decp`) VALUES ('1', '测试1', '我是测试1');
INSERT INTO `posp`.`people` (`id`, `namep`, `decp`) VALUES ('2', '小王', '我是小王');
