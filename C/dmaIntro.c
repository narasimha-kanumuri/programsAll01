snprintf(scanset, sizeof(scanset), "%%[^%c-%c]", s, e);
sscanf(scanset, str);
}