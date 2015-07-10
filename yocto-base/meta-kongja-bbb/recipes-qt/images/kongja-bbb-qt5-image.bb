DESCRIPTION = "An image that will launch into the demo application for the embedded version of Qt."
LICENSE = "MIT"
PR = "r0"

LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

IMAGE_FEATURES += "ssh-server-openssh package-management"

IMAGE_INSTALL +=       " \
                         packagegroup-core-boot \
                         packagegroup-core-full-cmdline \
                         packagegroup-base-wifi \
                         packagegroup-base-bluetooth \
                         packagegroup-base-usbgadget \
                         openssh-sftp \
                         openssh-sftp-server \
                         kernel-modules \
                         packagegroup-core-buildessential pkgconfig \
                         boost cmake zlib glib-2.0 \
                         ruby \
                         cpufrequtils \
                         gstreamer \
                         gst-meta-video \
                         gst-plugins-base-app \
                         gst-plugins-base \
                         gst-plugins-good \
                         gst-plugins-good-rtsp \
                         gst-plugins-good-udp \
                         gst-plugins-good-rtpmanager \
                         gst-plugins-good-rtp \
                         gst-plugins-good-video4linux2 \
                         openssh-sftp-server \
                         qtbase \
                         qtbase-fonts \
                         qtbase-plugins \
                         qtbase-tools \
                         qtdeclarative \
                         qtdeclarative-plugins \
                         qtdeclarative-tools \
                         qtdeclarative-qmlplugins \
                         qtmultimedia \
                         qtmultimedia-plugins \
                         qtmultimedia-qmlplugins \
                         qtsvg \
                         qtsvg-plugins \
                         qtsensors \
                         qtimageformats-plugins \
                         qtsystems \
                         qtsystems-tools \
                         qtsystems-qmlplugins \
                         qtscript \
                         qt3d \
                         qt3d-qmlplugins \
                         qt3d-tools \
                         qtconnectivity-qmlplugins \
                         qtlocation-plugins \
                         qtlocation-qmlplugins \
                         cairo pango fontconfig freetype pulseaudio dbus \
                         alsa-lib alsa-tools alsa-state alsa-utils-alsaconf \
                         i2c-tools \
                         libgles-omap3 \
                         omap3-sgx-modules \
                         libdrm \
                         qtwebkit-qmlplugins \
                         qtwebkit \
                         qtsmarthome \
                         qt5everywheredemo \
                         cinematicexperience \
                         qt5-demo-extrafiles \
                         "

inherit core-image populate_sdk_qt5
