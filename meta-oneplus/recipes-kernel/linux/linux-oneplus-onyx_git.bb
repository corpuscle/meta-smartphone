require recipes-kernel/linux/linux.inc

SECTION = "kernel"

# Mark archs/machines that this kernel supports
COMPATIBLE_MACHINE = "onyx"

DESCRIPTION = "Linux kernel for the OnePlus OnePlus X (onyx) device based on the official \
source from OnePlus"

SRC_URI = " \
  git://github.com/corpuscle/android_kernel_oneplus_onyx.git;branch=luneos/cm-14.1-wip \
"
S = "${WORKDIR}/git"

CMDLINE = "${ANDROID_BOOTIMG_CMDLINE}"

do_configure_prepend() {
    cp -v -f ${S}/arch/arm/configs/luneos_onyx_defconfig ${WORKDIR}/defconfig
}

SRCREV = "6d15bb4b61585f7c07e71ce2ed767465053ad5b2"

KV = "3.4.0"
PV = "${KV}+gitr${SRCPV}"
# for bumping PR bump MACHINE_KERNEL_PR in the machine config
inherit machine_kernel_pr

#Below was specifically for mido, might not be needed for onyx
#do_install_append () {
#    rm -rf ${D}/usr/src/usr
#
#}
