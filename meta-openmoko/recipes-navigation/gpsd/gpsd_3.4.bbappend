FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
EXTRA_DEPS = ""
EXTRA_DEPS_om-gta04 = "gta04-gps-handler"
RDEPENDS_${PN} += "${EXTRA_DEPS}"
PRINC := "${@int(PRINC) + 2}"
