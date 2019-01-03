require recipes-core/android-system-image/android-system-image.inc

COMPATIBLE_MACHINE = "onyx"

PV = "20181211-99"

SRC_URI = "file:///home/itm/resultsonyx/halium-luneos-7.1-${PV}-${MACHINE}.tar.bz2"
SRC_URI[md5sum] = "d81cd4c148ae7d38fee03f1d2d7b7488"
SRC_URI[sha256sum] = "0f7a634c616dabbf2877e56eb209b4a4a6c9b84ae386bda742c1d284aee43f35"
