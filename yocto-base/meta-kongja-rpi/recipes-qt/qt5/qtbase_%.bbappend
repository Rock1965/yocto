CXXFLAGS +=" -I${STAGING_DIR_TARGET}/usr/include/interface/vcos/pthreads \
             -I${STAGING_DIR_TARGET}/usr/include/interface/vmcs_host/linux "

LDFLAGS_prepend = " -lGLESv2 "
