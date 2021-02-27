require pressurelogger.inc

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "${HOMEPAGE}/Src/main.cpp;md5=6df318d21fd57edacb9b49c2a90ac866"

SRC_URI = "${HOMEPAGE}/"

S = "${WORKDIR}${HOME}/pressure_logger/host"

inherit cmake

do_install() {
	install -d ${D}${bindir}
	install -m 0755 PressureLogger ${D}${bindir}
}

